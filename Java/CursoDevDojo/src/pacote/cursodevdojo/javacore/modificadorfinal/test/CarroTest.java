package pacote.cursodevdojo.javacore.modificadorfinal.test;

import pacote.cursodevdojo.javacore.modificadorfinal.model.Carro;

public class CarroTest {
	public static void main (String[] args) {
		Carro carro = new Carro("Carro1", 200);
		//Carro.VELOCIDADE_LIMITE=100; Não é possível pois é uma variável constante
		System.out.println(carro);
	}
}
