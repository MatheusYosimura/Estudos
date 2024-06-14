package pacote.cursodevdojo.javacore.polimorfismo.model;

public class Tomate extends Produto{
	private static final double IMPOSTO = 0.06;
	private String validade = "01/10/2025";
	public Tomate(String nome, double valor) {
		super(nome, valor);
	}
	@Override
	public double calculaImposto() {
		System.out.println("Calculando imposto do Tomate");
		return this.valor*IMPOSTO;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}

}
