package pacote.cursodevdojo.javacore.heranca.model;

public class Funcionario extends Pessoa{
	private double salario;
	static {
		System.out.println("Dentro do bloco de inicialização estático Funcionario");
	}
	{
		System.out.println("Dentro do bloco de inicialização 1 não estático Funcionario");
	}
	{
		System.out.println("Dentro do bloco de inicialização 2 não estático Funcionario");
	}
	public Funcionario(String nome, long CPF, double salario) {
		super(nome,CPF);
		this.salario=salario;
		System.out.println("Dentro do Construtor Funcionario");
	}
	
	public void imprime() {
		this.nome="Teste Protected";
		super.imprime();
		System.out.println(this.salario);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Nome: "+this.nome+
				"\nCPF: "+this.getCPF()+
				"\nEndereço: "+this.getEndereco().getRua()+" | CEP: "+this.getEndereco().getCep()+
				"\nSalário: "+this.salario;
	}
}
