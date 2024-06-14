package pacote.cursodevdojo.javacore.exception.exception.test;
import java.io.*;

public class ExceptionTest02 {
	public static void main(String [] args) {
		try {
			criaArquivo();
		}catch(IOException e) {
			System.out.println("Problema ao criar arquivo");
		}
		/*try{
			criaArquivo();
		}catch(RuntimeException e) {
			//e.printStackTrace();
		}*/
		//criaArquivo();
	}
	public static void criaArquivo()throws IOException{
		File f = new File("arquo/novoArquivo.txt");
		try {
		f.createNewFile();	
		}catch(IOException e) {
			e.printStackTrace();
			throw e;
			//throw new RuntimeException("Erro ao criar arquivo");
		}
	}
}
