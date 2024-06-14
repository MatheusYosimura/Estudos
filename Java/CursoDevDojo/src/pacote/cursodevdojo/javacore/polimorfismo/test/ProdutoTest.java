package pacote.cursodevdojo.javacore.polimorfismo.test;

import pacote.cursodevdojo.javacore.polimorfismo.model.*;
import pacote.cursodevdojo.javacore.polimorfismo.controller_servico.*;


public class ProdutoTest {
	public static void main (String[] args) {
		Computador computador = new Computador("Nitro 5", 4000);
		Tomate tomate = new Tomate("Siciliano",10);
		CalculadorImposto.computador(computador);
		CalculadorImposto.tomate(tomate);
	}
}
