package pacote.cursodevdojo.javacore.introducaometodos.model;

public class Pessoa2 {
	private String nome;
	private int idade;

	public void imprime() {
		System.out.println("Nome: "+getNome()+"\nIdade: "+getIdade());
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}

	public void setIdade(int idade) {
		if(idade<=0) {
			System.out.println("Idade Inválida");
			return;
		}
		this.idade=idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
}
