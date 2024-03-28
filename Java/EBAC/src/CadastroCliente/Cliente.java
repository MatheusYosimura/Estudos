package CadastroCliente;

public class Cliente {
	private String nome;
	private Long cpf;
	private Long telefone;
	private String endereco;
	private int numero;
	private String cidade;
	private String estado;
	
	public Cliente(String nome, Long cpf, Long telefone, String endereco, int numero, String cidade, String estado){
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "\n----------\n"
				+ "\n|Nome: " + getNome()
				+ "\n|CPF: " + getCpf()
				+ "\n|Telefone: " + getTelefone()
				+ "\n|Endereco: " + getEndereco()
				+ "\n|Numero: " + getNumero()
				+ "\n|Cidade: " + getCidade()
				+ "\n|Estado: " + getEstado()
				+ "\n----------";
	}
	
	
}
