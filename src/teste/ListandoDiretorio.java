package teste;

import java.io.File;
import java.util.Scanner;

public class ListandoDiretorio {

	public static void main(String[] args) {
		// Listando diretório a través do Java
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho: ");
		String caminho = sc.nextLine();
		
		File path = new File(caminho);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files");
		for(File file : files) {
			System.out.println(file);
		}
		
		System.out.println("Criando uma pasta");
		boolean sucesso = new File(caminho + "\\subdiretorio").mkdir();
		System.out.println("Subdiretório criado com sucesso! "+sucesso);
		
		sc.close();
	}

}
