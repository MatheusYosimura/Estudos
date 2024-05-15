package pacote.cursodevdojo.javacore.sobrecarga.test;

import pacote.cursodevdojo.javacore.sobrecarga.model.Anime;

public class AnimeTest {
	public static void main (String [] args) {
		Anime anime1 = new Anime("One Piece","TV",1100);
		Anime anime2 = new Anime("Pokemon","TV",2000,"Aventura");
		Anime anime3 = new Anime("Naruto","TV", 500, "Aventura", "Shonen Jump");
		anime1.imprime();
		anime2.imprime();
		anime3.imprime();
	}
}
