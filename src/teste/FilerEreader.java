package teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilerEreader {

	public static void main(String[] args) {
		// Usando um esquema básico para utilização do FileReader e BufferedReader
		String path = "C:\\Barboza\\Cursos\\JAVA\\ws2-eclipse\\manipulandoarquivos\\nomes.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine(); //leio a linha até a última e vai gerar um line vazio
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
		}
		catch(IOException e) {
			System.out.println("Error :"+e.getMessage());
		}
		
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
