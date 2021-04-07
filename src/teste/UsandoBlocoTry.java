package teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsandoBlocoTry {

	public static void main(String[] args) {
		// Usando o bloco try
		String caminho = "C:\\Barboza\\Cursos\\JAVA\\ws2-eclipse\\manipulandoarquivos\\nomes.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error :"+e.getMessage());
		}

	}

}
