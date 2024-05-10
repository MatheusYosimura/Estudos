package pacote.cursodevdojo.javacore.introducaometodos.model;

public class Calculadora {
	public void somaDoisNumeros () {
		System.out.println("10+10=20");
	}
	public void subtraiDoisNumeros() {
		System.out.println("10-10=0");
	}
	public void multiplicaDoisNumeros(int a, int b) {
		int c = a*b;
		System.out.println(a+" * "+b+" = "+c);
	}
	public double divideDoisNumeros(double num1, double num2) {
		return num1/num2;
	}
	public void alteraNumeros(int num1, int num2) {
		num1=10;
		num2=20;
		System.out.println("parametro 1 = "+num1 +" |parametro 2 = "+ num2);//Valor é alterado só no método. O argumento é COPIADO para o parametro.
	}
}
