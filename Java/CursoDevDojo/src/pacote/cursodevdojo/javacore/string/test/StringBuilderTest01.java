package pacote.cursodevdojo.javacore.string.test;

public class StringBuilderTest01 {

	public static void main(String[] args) {
		String nome = "Matheus";
		StringBuilder sb = new StringBuilder("Matheus");
		//nome = sb; //Não funciona
		//sb = nome; //Não funciona
		//sb = "Matheus"; //Não funciona
		nome = sb.toString(); // FUnciona
		nome.concat(" Yosimura");
		System.out.println(nome);
		sb.append(" Yosimura");
		System.out.println(sb);
		sb.substring(0,7);
		System.out.println(sb);
		sb = new StringBuilder(sb.substring(0,7));
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
	}

}
