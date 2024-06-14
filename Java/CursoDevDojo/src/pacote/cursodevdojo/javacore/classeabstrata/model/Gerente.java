package pacote.cursodevdojo.javacore.classeabstrata.model;

public class Gerente extends Funcionario{
	public Gerente (String nome, double salario) {
		super(nome,salario);
	}

	@Override
	public void calculaBonus() {
		this.salario=salario*1.1;
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + "]";
	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		
	}
	
}
