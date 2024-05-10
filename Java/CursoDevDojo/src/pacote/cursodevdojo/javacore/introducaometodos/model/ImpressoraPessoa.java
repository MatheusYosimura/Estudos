package pacote.cursodevdojo.javacore.introducaometodos.model;

public class ImpressoraPessoa {
	public void imprime(Pessoa pessoa) {
		System.out.println("Nome: "+pessoa.nome+" | Idade: "+pessoa.idade+" | Sexo: "+pessoa.sexo);
	}
	public void modifica(Pessoa pessoa) {//Como é passado por referência, a mudança fica no argumento passado para o parâmetro
		pessoa.nome="Nome Diferente";
	}
}
