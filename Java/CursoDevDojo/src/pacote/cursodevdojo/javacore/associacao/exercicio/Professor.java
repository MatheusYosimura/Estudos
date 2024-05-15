package pacote.cursodevdojo.javacore.associacao.exercicio;

public class Professor {
	private String nome,especialidade;
	private Seminario[] seminarios;
	
	public Professor (String nome, String especialidade) {
		this.setNome(nome);
		this.setEspecialidade(especialidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	public void imprime() {
		System.out.println("====================================");
		System.out.println("Professor "+this.nome);
		System.out.println("Seminário: ");
		for (Seminario seminario :this.seminarios) {
			System.out.println(seminario.getTitulo());
		}
		System.out.println("====================================");
	}
}
