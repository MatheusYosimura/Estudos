package pacote.cursodevdojo.javacore.associacao.exercicio;

public class Seminario {
	private String titulo;
	private Local local;
	private Aluno[] alunos;
	
	public Seminario(String titulo) {
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public void imprime() {
		System.out.println("====================================");
		System.out.println("Seminário "+this.titulo);
		System.out.println("Local: "+this.local.getEndereco());
		System.out.println("Alunos: ");
		for(Aluno aluno : this.alunos) {
			System.out.println(aluno.getNome());
		}
		System.out.println("====================================");
	}
	
}
