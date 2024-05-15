package pacote.cursodevdojo.javacore.modificadorstatic.test;

import pacote.cursodevdojo.javacore.modificadorstatic.model.*;

public class Carrotest {
	public static void main (String[] args) {
		Carro carro1 = new Carro("BMW",210);
		Carro carro2 = new Carro("Mercedes",250);
		Carro carro3 = new Carro("Audi",280);
		carro1.imprime();
		carro2.imprime();
		carro3.imprime();
		carro1.setVelocidadeLimite(300);//Em teoria, mudou o atributo do carro 1, porém a mudança vale para todos, pois é um atributo de classe
		carro1.imprime();
		carro2.imprime();
		carro3.imprime();
		Carro.setVelocidadeLimite(330);//Utilizando método static através da classe, e não de um objeto instanciado. 
		carro1.imprime();
		carro2.imprime();
		carro3.imprime();
	}
}
