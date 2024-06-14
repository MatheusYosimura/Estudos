package pacote.cursodevdojo.javacore.exception.runtime.test;

import java.io.*;


public class RuntimeExceptionTest04 {

	public static void main(String[] args) {
		teste();
	}
	private static void teste() {
		/*try {
			throw new IllegalArgumentException();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("1");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("2");
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("3");
		}catch(RuntimeException e){
			e.printStackTrace();
			System.out.println("4");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("5");
		}*/
		try {
			throw new IllegalArgumentException();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("1");
		}catch(IndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
			System.out.println("2");
		}catch(RuntimeException e){
			e.printStackTrace();
			System.out.println("4");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("5");
		}
		
		try {
			teste02();
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("blablabla");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private static void teste02() throws IndexOutOfBoundsException, IOException{
		throw new FileNotFoundException();
	}
}
