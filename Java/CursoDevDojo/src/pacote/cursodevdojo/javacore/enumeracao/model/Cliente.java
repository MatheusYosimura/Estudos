package pacote.cursodevdojo.javacore.enumeracao.model;

public class Cliente {
	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;
	
	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipo) {
		this.nome=nome;
		this.tipoCliente=tipoCliente;
		this.tipoPagamento=tipo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipoCliente=" + tipoCliente + ", tipoClienteID=" + tipoCliente.getValor()+", tipoPagamento=" + tipoPagamento + "]";
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
}
