package pacote.cursodevdojo.javacore.introducaometodos.model;

public class Funcionário {
	private int idade;
	private double[] salarios;
	private double media;
	private String nome;
	
	public void imprime() {
		System.out.println("Nome: "+this.nome+
				"\nIdade: "+this.idade);
		if(this.salarios==null||this.media==0) {
			return;
		}
		int i=1;
		for(double salario: this.salarios) {
			System.out.println("Salario "+ i++ +" = "+salario);
		}
		System.out.println("Média salarial = "+this.media);
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double[] getSalarios() {
		return salarios;
	}
	public void setSalarios(double[] salarios) {
		if(salarios==null) {
			System.out.println("Valor dos salários não expecificado");
			return;
		}
		this.salarios = salarios;
		calculaMedia();
	}
	private void calculaMedia() {
		for(double salario: salarios) {
			this.media+=salario;
		}
		this.media/=salarios.length;
	}
	
	public double getMedia() {
		return media;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
