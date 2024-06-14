package pacote.cursodevdojo.javacore.polimorfismo.controller_servico;

import pacote.cursodevdojo.javacore.polimorfismo.model.*;

public class CalculadorImposto {
	public static void computador(Computador comp) {
		double imposto = comp.calculaImposto();
		System.out.println("Computador "+comp.getNome());
		System.out.println("Valor R$ "+comp.getValor());
		System.out.println("Imposto R$ "+imposto);
		System.out.println("Total R$ "+(comp.getValor()+imposto));

		
	}
	public static void tomate(Tomate toma) {
		double imposto = toma.calculaImposto();
		System.out.println("Tomate "+toma.getNome());
		System.out.println("Valor R$ "+toma.getValor());
		System.out.println("Imposto R$ "+imposto);
		System.out.println("Total R$ "+(toma.getValor()+imposto));

	}
	public static void produto(Produto produto) {
		double imposto = produto.calculaImposto();
		System.out.println("Produto "+produto.getNome());
		System.out.println("Valor R$ "+produto.getValor());
		System.out.println("Imposto R$ "+imposto);
		System.out.println("Total R$ "+(produto.getValor()+imposto));
		if(produto instanceof Tomate) {
			System.out.println("Validade do Tomate: "+((Tomate)produto).getValidade());
		}
	}
}
