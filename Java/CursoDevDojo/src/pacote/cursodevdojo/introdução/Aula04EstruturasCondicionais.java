package pacote.cursodevdojo.introdução;
import java.util.*;
import java.io.IOException;

public class Aula04EstruturasCondicionais {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha um número:");	
		int a=sc.nextInt();
		if (a>10) {
			System.out.println(">10");
		}else if(a==10){
			System.out.println("=10");
		}else {
			System.out.println("<10");
		}
		String var = (a%2==0) ? "Valor par" : "Valor impar";
		System.out.println(var);		
		System.out.println("--------------------------------------------");
		
		//Exercício - Calculo de imposto na Holanda
		System.out.print("Insira o salário para calcular o imposto: ");	
		double salario = sc.nextDouble();
		double imposto;
		if (salario<34712) {
			imposto = salario*0.0970;
		}else if (salario<68507) {
			imposto = salario*0.3735;
		}else {
			imposto = salario*0.4950;
		}
		System.out.println("Você pagara de imposto "+String.format("%.2f",imposto)+" euros");		
		System.out.println("--------------------------------------------");

		System.out.print("Escolha uma opção de 1 a 4");	
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Opção 1");
			break;
		case 2:
			System.out.println("Opção 2");
			break;
		case 3:
			System.out.println("Opção 3");
			break;
		case 4: 
			System.out.println("Opção 4");
			break;
		default:
			System.out.println("Opção invalida");
		}
		
		//Exercício - Indicar se o dia é útil ou não;
		System.out.println("--------------------------------------------");
		System.out.println("Insira um dia da semana (1 para domingo até 7 para ao sábado)");
		int dia = sc.nextInt();
		switch (dia) {
		case 1:
		case 7:
			System.out.println("Fim de Semana");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia útil");
			break;
		default:
			System.out.println("Opção invalida");
		}
		System.out.println("--------------------------------------------");
	}
}
