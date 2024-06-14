package pacote.cursodevdojo.javacore.string.test;

public class StringTest01 {

	public static void main(String[] args) {
		String nome = "William";
		String nome2 = "William";
		System.out.println(nome==nome2); //true
		nome.concat(" de Souza");
		System.out.println(nome==nome2); //true
		nome = nome.concat(" de Souza");
		System.out.println(nome==nome2); //false
		nome = "Santos Rebaixado";
		System.out.println(nome==nome2); //false
		nome = new String("William");
		System.out.println(nome==nome2); //false
		System.out.println(nome.intern()==nome2); //true
	}

}
