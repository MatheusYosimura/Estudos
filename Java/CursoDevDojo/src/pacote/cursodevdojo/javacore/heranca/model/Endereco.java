package pacote.cursodevdojo.javacore.heranca.model;

public class Endereco {
	private String rua;
	private int cep;
	
	public Endereco(String rua, int cep) {
		this.rua=rua;
		this.cep=cep;
	}
	
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
}
