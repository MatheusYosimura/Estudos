package pacote.cursodevdojo.javacore.enumeracao.test;

import pacote.cursodevdojo.javacore.enumeracao.model.*;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Joaozim",TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
		Cliente cliente2 = new Cliente("Pedrim",TipoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);
		Cliente cliente3 = new Cliente("Markin",TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
		Cliente cliente4 = new Cliente("Luizin",TipoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);
		System.out.println(cliente4);
		TipoCliente ex = TipoCliente.escontrarComNome("Pessoa Física");
		System.out.println(ex);
	}

}
