package pacote.cursodevdojo.javacore.string.test;

public class StringTest02 {

	public static void main(String[] args) {
		String nome = " Juliana ";
		System.out.println(nome.length());
		System.out.println(nome.charAt(0));
		System.out.println(nome.replace('a','o'));
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.substring(0,2));
		nome=nome.trim();
		System.out.println(nome.length());
		System.out.println(nome.charAt(0));
		System.out.println(nome.replace('a','o'));
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.substring(0,2));
	}

}
