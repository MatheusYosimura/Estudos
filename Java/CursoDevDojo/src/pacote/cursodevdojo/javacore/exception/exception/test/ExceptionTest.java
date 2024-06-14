package pacote.cursodevdojo.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		criarNovoArquivo();
	}
	public static void criarNovoArquivo() {
		File file = new File("arquivo/teste.txt");
		try {
			boolean criado = file.createNewFile();
			System.out.println((criado==true)?"Arquivo criado":"Arquivo já existente");
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao criar o arquivo");
		}
	}
}
