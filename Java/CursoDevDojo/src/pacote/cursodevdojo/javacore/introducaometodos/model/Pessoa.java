package pacote.cursodevdojo.javacore.introducaometodos.model;

public class Pessoa {
	public String nome;
	public int idade;
	public char sexo;
	
	public void imprime() {
		System.out.println("Nome: "+this.nome+" | Idade: "+this.idade+" | Sexo: "+this.sexo);
	}
}
