package pacote.cursodevdojo.javacore.associacao.test;

import pacote.cursodevdojo.javacore.associacao.model.*;

public class JogadorTest {
	public static void main (String [] args) {
		Jogador jogador1 = new Jogador("Pele");
		Jogador jogador2 = new Jogador("Romario");
		Jogador jogador3 = new Jogador("Maradona");
		Time time1 = new Time("Brasil");
		Time time2 = new Time("Argentina");
		Jogador[] jogadores = {jogador1, jogador2, jogador3};
		for( Jogador jogador : jogadores) {
			jogador.imprime();
		}
		System.out.println("------------------");
		jogador1.setTime(time1);
		jogador2.setTime(time1);
		jogador3.setTime(time2);
		for( Jogador jogador : jogadores) {
			jogador.imprime();
		}
		time1.setJogadores(new Jogador[] {jogador1, jogador2});
		time2.setJogadores(new Jogador[] {jogador3});
		System.out.println("------------------");
		time1.imprime();
		time2.imprime();
	}
}
