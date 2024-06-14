package pacote.cursodevdojo.javacore.exception.model;

import java.io.*;

public class Obj1 implements Closeable{
	@Override
	public void close() throws IOException{
		System.out.println("Fechando Obj1");
	}
}
