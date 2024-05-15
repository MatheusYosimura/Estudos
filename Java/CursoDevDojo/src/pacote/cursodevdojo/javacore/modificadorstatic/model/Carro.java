package pacote.cursodevdojo.javacore.modificadorstatic.model;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite=280;
	
	public Carro(String nome, double velocidade) {
		this.nome=nome;
		this.velocidadeMaxima=velocidade;
	}
	
	public void imprime() {
		System.out.println("Nome: "+this.nome+"\nVelocidade Máxima: "+this.velocidadeMaxima+"\nVelocidade Limite: "+Carro.velocidadeLimite);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public double getVelocidadeLimite() {
		return velocidadeLimite;
	}
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
}
