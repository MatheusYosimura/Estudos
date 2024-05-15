package pacote.cursodevdojo.javacore.sobrecarga.model;

public class Anime {
	private String tipo, nome, genero, studio;
	private int episodios;
	//Bloco de inicialização
	{
		System.out.println("Dentro do bloco de inicialização");
	}
	public Anime() {}//Sobrecarga de Construtores
	
	public Anime(String nome, String tipo, int episodios) {
		this.nome = nome;
		this.tipo=tipo;
		this.episodios=episodios;
	}
	public Anime(String nome, String tipo, int episodios, String genero) {
		this(nome,tipo,episodios);
		this.genero=genero;
	}
	public Anime(String nome, String tipo, int episodios, String genero, String studio) {
		this(nome,tipo,episodios,genero);
		this.studio=studio;
	}
	/*
	public void init(String nome, String tipo, int episodios) {
		this.nome = nome;
		this.tipo=tipo;
		this.episodios=episodios;
	}
	
	public void init(String nome, String tipo, String genero, int episodios) {
		this.init(nome, tipo, episodios);
		this.genero=genero;
	}*/
	
	public void imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Episódios: "+this.episodios);
		System.out.println("Gênero: "+this.genero);
		System.out.println("Studio: "+this.studio);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEpisodios() {
		return episodios;
	}
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
