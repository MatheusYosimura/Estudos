package pacote.cursodevdojo.javacore.polimorfismo.model;

public class Televisão extends Produto{
	private static final double IMPOSTO = 0.21;
	public Televisão(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calculaImposto() {
		System.out.println("Calculando imposto da Televisão");
		return this.valor*IMPOSTO;
	}
}
