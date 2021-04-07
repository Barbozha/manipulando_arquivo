package teste;

import java.io.File;
import java.util.Scanner;

public class LendoArquivoFormaSimples {

	public static void main(String[] args) {
		// Lendo arquivos de forma simples
		File file = new File("C:\\Barboza\\Cursos\\JAVA\\ws2-eclipse\\manipulandoarquivos\\nomes.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println("Error :"+e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
