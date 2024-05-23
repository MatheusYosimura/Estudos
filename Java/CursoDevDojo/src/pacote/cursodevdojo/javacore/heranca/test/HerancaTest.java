package pacote.cursodevdojo.javacore.heranca.test;

import pacote.cursodevdojo.javacore.heranca.model.*;

public class HerancaTest {
	public static void main (String[] args) {
		Endereco endereco = new Endereco("Rua dos Limoeiros",75490200);
		Pessoa pessoa = new Pessoa("Juliana",12312312312L);
		//pessoa.setCPF(12312312312L);
		//pessoa.setNome("Juliana");
		pessoa.setEndereco(endereco);
		pessoa.imprime();
		
		Funcionario funcionario = new Funcionario("Matheus",32132132132L,1000.00);
		funcionario.setEndereco(endereco);
		//funcionario.setCPF(32132132132L);
		//funcionario.setNome("Matheus");
		//funcionario.setSalario(1000.00);
		funcionario.imprime();
		System.out.println(funcionario);
	}
}
