package pacote.cursodevdojo.javacore.introducaometodos.test;
import pacote.cursodevdojo.javacore.introducaometodos.model.*;

public class CalculadoraTest {
	public static void main (String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();
		calculadora.multiplicaDoisNumeros(2, 3);
		double var = calculadora.divideDoisNumeros(10, 4);
		System.out.println("10/4 = "+var);
		calculadora.alteraNumeros(100, 200);
	}
}
