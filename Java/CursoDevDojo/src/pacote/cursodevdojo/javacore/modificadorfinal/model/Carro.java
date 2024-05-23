package pacote.cursodevdojo.javacore.modificadorfinal.model;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	public final double VELOCIDADE_LIMITE;
	private final Comprador COMPRADOR = new Comprador();
	
	{
		VELOCIDADE_LIMITE=280;
	}
	
	public Carro(String nome, double velocidade) {
		this.nome=nome;
		this.velocidadeMaxima=velocidade;
		COMPRADOR.setNome("Nome Genérico");
	}
	
	@Override
	public String toString() {
		return("Nome: "+this.nome+"\nVelocidade Máxima: "+this.velocidadeMaxima+"\nVelocidade Limite: "+VELOCIDADE_LIMITE+"\nDono do Veículo: "+COMPRADOR.getNome());
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
		return VELOCIDADE_LIMITE;
	}
	/*public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}*/
	
}
