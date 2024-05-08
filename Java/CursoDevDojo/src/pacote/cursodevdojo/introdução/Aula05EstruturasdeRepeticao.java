package pacote.cursodevdojo.introdução;

public class Aula05EstruturasdeRepeticao {
	public static void main (String[] args) {
		int a=0;
		while(a<10) {
			System.out.println(a);
			++a;
		}
		a=0;
		do {
			System.out.println(a);
			++a;
		}while(a<10);
		for(a=0;a<10;a++) {
			System.out.println(a);
		}
		
		//Exercício - Todos os pares de 0 até 10000
		for (int i = 0; i <=10000; i++) {
			if(i%2==0) {
				System.out.println("["+i+"]");
			}
		}
		//Usando break
		for (int i = 0; i <=10000; i++) {
			if(i%2==0) {
				System.out.println("["+i+"]");
			}
			if(i==300) {
				break;
			}
		}
		//Exercício utilizando Break - Calcular quantas parcelas eu pago um carro de 30000, com as parcelas sendo valorParcela>=1000
		double valorCarro = 30000;
		for (int parcelas=1; parcelas <=valorCarro; parcelas++) {
			double valorParcela = valorCarro/parcelas;
			if(valorParcela<1000) {
				break;
			}
			System.out.println(parcelas+" parcelas de R$"+String.format("%.2f",valorParcela));
		}
		//Utilizando Continue - Imprimir de 0 a 10, exceto 5
		for (int i=0;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
