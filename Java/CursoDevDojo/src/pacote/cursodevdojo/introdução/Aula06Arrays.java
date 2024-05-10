package pacote.cursodevdojo.introdução;

public class Aula06Arrays {
	public static void main (String[] args) {
		int [] idades =  new int[3];
		idades[0]=15;
		idades[1]=20;
		idades[2]=25;
		System.out.println(idades[0]+"-"+idades[1]+"-"+idades[2]);
		for (int i=0; i<idades.length; i++) {
			System.out.println(idades[i]);
		}
		for (int varRecebe : idades) { // foreach
			System.out.println(varRecebe);
		}
	}
}
