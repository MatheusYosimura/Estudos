package pacote.cursodevdojo.javacore.associacao.test;

import java.util.*;

public class Leitura {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = sc.nextLine();
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		System.out.println("Dite seu sexo (M ou F ou O para outro):");
		char sexo = sc.next().charAt(0);
		System.out.println("Digite seu salário:");
		double salario = sc.nextDouble();
		System.out.println("--------------------------------------"
				+ "\nNome: "+nome
				+ "\nIdade: "+idade
				+ "\nSexo: "+sexo
				+ "\nSalário: "+salario
				+ "\n--------------------------------------");
	}
}
