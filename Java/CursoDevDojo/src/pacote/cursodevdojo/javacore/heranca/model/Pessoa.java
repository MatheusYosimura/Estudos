package pacote.cursodevdojo.javacore.heranca.model;

public class Pessoa {
	protected String nome;
	private long CPF;
	private Endereco endereco;
	static {
		System.out.println("Dentro do bloco de inicialização estático Pessoa");
	}
	{
		System.out.println("Dentro do bloco de inicialização 1 não estático Pessoa");
	}
	{
		System.out.println("Dentro do bloco de inicialização 2 não estático Pessoa");
	}
	public Pessoa(String nome) {
		this.nome=nome;
		System.out.println("Dentro do Construtor 1 Pessoa");
	}
	
	public Pessoa(String nome, long CPF) {
		this(nome);
		this.CPF=CPF;
		System.out.println("Dentro do Construtor 2 Pessoa");
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.CPF);
		System.out.println(this.endereco.getRua()+" "+this.endereco.getCep());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
