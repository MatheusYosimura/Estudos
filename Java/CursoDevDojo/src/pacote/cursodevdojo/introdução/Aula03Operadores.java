package pacote.cursodevdojo.introdução;

public class Aula03Operadores {
	public static void main (String[] args) {
		int a=1, b=2;
		//Apenas revisando todos os operadore
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a/(double)b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>10 && b==2);
		System.out.println(a>10 || b==2);
		//A partir daqui, os valor da variável (a) muda a cada print, pois está recebendo novas atribuições 
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		System.out.println(a++); //Soma depois de imprimir
		System.out.println(++a); //Soma antes de imprimir
		System.out.println(b--); //Subtrai depois de imprimir
		System.out.println(--b); //Subtrai antes de imprimir
	}
}
