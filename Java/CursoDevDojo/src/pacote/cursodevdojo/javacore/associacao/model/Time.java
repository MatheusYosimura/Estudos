package pacote.cursodevdojo.javacore.associacao.model;

public class Time {
	private String nome;
	private Jogador[] jogadores;
	
	public Time(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
	public void imprime() {
		int i=1;
		System.out.println("Time: "+this.nome);
		for(Jogador jogador : jogadores) {
			System.out.println("Jogador "+i+++" : "+jogador.getNome());
		}
	}
}
