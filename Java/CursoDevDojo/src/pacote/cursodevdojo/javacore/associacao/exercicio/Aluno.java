package pacote.cursodevdojo.javacore.associacao.exercicio;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;
	
	public Aluno(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	
	public void imprime() {
		System.out.println("====================================");	
		System.out.println("Aluno : "+this.nome);
		System.out.println("Seminário: "+this.seminario.getTitulo());
		System.out.println("====================================");
	}
}
