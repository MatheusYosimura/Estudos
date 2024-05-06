package pacote.cursodevdojo.introdução;

public class Aula02TiposPrimitivos {
	public static void main (String[] args) {
		//Aulas sobre variáveis primitivas. Nada de novo por enquanto
		int x = 4; 
		System.out.println("2 + 2 é igual a " + x);
		short intShort = 2;
		long intLong = 200000000000L;
		float numFloat = 1.000001F;
		double numDouble = 1.000000000000000001D;
		byte numByte = 127;
		boolean varBoolean = true;
		char varChar = 'a';
		char varCharUnicode = '\u0040';
		String palavra = "Essa é uma String"; 
		
		// Exercicio - Imprimir "Eu, <> morando no endereço <> confirmo que recebi o salário de <>, na data <>
		String nome = "Matheus";
		String endereco = "Rua da minha casa";
		double salario = 1000.00;
		String data = "01/01/2024";
		System.out.println("Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salário de "+ String.format("%.2f",salario) +", na data "+data);
		int a = 1;
		int b = 2;
		double c = (double)a/b;
		System.out.println(c);
	}
}
