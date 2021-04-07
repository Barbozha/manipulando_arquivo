package teste;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivo {

	public static void main(String[] args) {
		// Lendo arquivo txt
		File file = new File("C:\\Barboza\\Cursos\\JAVA\\ws2-eclipse\\manipulandoarquivos\\nomes.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error :"+e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
