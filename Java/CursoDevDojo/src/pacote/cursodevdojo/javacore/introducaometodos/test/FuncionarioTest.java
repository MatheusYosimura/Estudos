package pacote.cursodevdojo.javacore.introducaometodos.test;

import pacote.cursodevdojo.javacore.introducaometodos.model.Funcionário;

public class FuncionarioTest {
	public static void main (String [] args) {
		Funcionário func = new Funcionário();
		func.setNome("Juliana");
		func.setIdade(24);
		func.setSalarios(new double[]{2000.00,2200.00,3000.00,3300});
		func.imprime();
	}
}
