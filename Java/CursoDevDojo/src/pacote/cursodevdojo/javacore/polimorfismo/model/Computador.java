package pacote.cursodevdojo.javacore.polimorfismo.model;

public class Computador extends Produto{
	private static final double IMPOSTO = 0.21;
	public Computador(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calculaImposto() {
		System.out.println("Calculando imposto do Computador");
		return this.valor*IMPOSTO;
	}

}
