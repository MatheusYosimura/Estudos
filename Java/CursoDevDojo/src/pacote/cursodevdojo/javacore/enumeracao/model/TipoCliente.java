package pacote.cursodevdojo.javacore.enumeracao.model;

public enum TipoCliente {
	PESSOA_FISICA(1,"Pessoa Física"),
	PESSOA_JURIDICA(2,"Pessoa Juridica");
	private final String nome;
	private final int valor;
	public static TipoCliente escontrarComNome(String nome) {
		for(TipoCliente tipo : values()) {
			if(tipo.getNome().equals(nome)) {
				return tipo;
			}
		}
		return null;
	}
	TipoCliente(int valor, String nome){
		this.valor=valor;
		this.nome=nome;
	}
	public int getValor() {
		return this.valor;
	}
	public String getNome() {
		return nome;
	}
}
