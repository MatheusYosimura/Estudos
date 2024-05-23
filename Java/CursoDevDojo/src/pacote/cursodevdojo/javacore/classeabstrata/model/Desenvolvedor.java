package pacote.cursodevdojo.javacore.classeabstrata.model;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculaBonus() {
		this.salario=salario*1.15;
	}

	@Override
	public String toString() {
		return "Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
	}
	

}
