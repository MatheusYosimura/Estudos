package pacote.cursodevdojo.javacore.exception.exception.test;

import pacote.cursodevdojo.javacore.exception.model.*;
import java.io.*;

public class TryWithResources {

	public static void main(String[] args) {
		
		try(Obj1 obj1 = new Obj1();
				Obj2 obj2 = new Obj2()){
		//Verificando que o TryWithResourcer realmente fecha os recursos	
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(Reader r1 = new BufferedReader(new FileReader("texto1.txt"));
				Reader r2 = new BufferedReader(new FileReader("texto2.txt"))){
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
