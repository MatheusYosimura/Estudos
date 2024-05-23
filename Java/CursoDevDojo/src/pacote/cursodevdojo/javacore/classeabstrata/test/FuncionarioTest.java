package pacote.cursodevdojo.javacore.classeabstrata.test;

import pacote.cursodevdojo.javacore.classeabstrata.model.*;

public class FuncionarioTest {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Gerente", 1000);
		Desenvolvedor dev = new Desenvolvedor("Desenvolvedor",1500);
		System.out.println(gerente);
		System.out.println(dev);
	}

}
