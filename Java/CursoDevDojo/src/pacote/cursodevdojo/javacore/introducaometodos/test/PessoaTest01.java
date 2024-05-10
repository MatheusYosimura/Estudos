package pacote.cursodevdojo.javacore.introducaometodos.test;

import pacote.cursodevdojo.javacore.introducaometodos.model.*;

public class PessoaTest01 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.idade=21;
		pessoa1.nome="Matheus";
		pessoa1.sexo='M';
		ImpressoraPessoa impressora = new ImpressoraPessoa();
		impressora.imprime(pessoa1);
		//impressora.modifica(pessoa1);
		//impressora.imprime(pessoa1);
		pessoa1.imprime();
	}

}
