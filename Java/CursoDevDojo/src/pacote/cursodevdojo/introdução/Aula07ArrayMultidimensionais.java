package pacote.cursodevdojo.introdução;

public class Aula07ArrayMultidimensionais {
	public static void main (String[] args) {
		int[][] array = new int [3][3];
		int x=1;
		
		System.out.println(array.length); // Retorna o tamanho da primeira dimensão
		System.out.println(array[0].length);//Retorna o tamanho da array apontada pela primeira variável da primeira dimensão
		
		for (int i=0; i<array.length;i++) {
			for (int j=0; j<array[i].length; j++) {
				array[i][j]= x++;
			}
		}
		for (int i=0; i<array.length;i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.print("["+array[i][j]+"]");
			}
			System.out.println();
		}
		System.out.println("---------");
		for(int[] num  : array) {//Variável num recebe o endereço de cada array que é apontada pela primeira dimensão
			for (int var : num) {//Variável var recebe os valores da array que num está apontando
				System.out.print("["+var+"]");
			}
			System.out.println();
		}
		System.out.println("---------");
		//Incializando array de forma "diferente"
		//int [][] array2 = {{1,2},{3,4}}; Outra forma de inicializar
		int [][] array2 = new  int[3][];
		
		for (int i=0; i<array2.length;i++) {//Determina o tamanho de cada array de segunda dimensão
			array2[i] = new int[i+1];
		}
		
		for (int i=0; i<array2.length;i++) {//Atribui valores a cada variável das arrays de segunda dimensão
			for (int j=0; j<array2[i].length; j++) {
				array2[i][j]= x++;
			}
		}
		
		for(int[] arrayBase : array2) {
			for(int num : arrayBase) {
				System.out.print("["+num+"]");
			}
			System.out.println();
		}
	}
}
