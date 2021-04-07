package teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriandoArquivoFileWrite {

	public static void main(String[] args) {
		// Criando arquivo com FileWrite
		
		String[] linhas = new String[] {"Amanda Migliori", "Alicinha Oliveira"};
		String caminho = "C:\\Barboza\\Cursos\\JAVA\\ws2-eclipse\\manipulandoarquivos\\saidanomes.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
			System.out.println("Ok! Criado!");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
