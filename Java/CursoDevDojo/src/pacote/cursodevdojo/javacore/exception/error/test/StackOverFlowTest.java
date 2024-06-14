package pacote.cursodevdojo.javacore.exception.error.test;

public class StackOverFlowTest {
	public static void main (String[] args) {
		recursividade();
	}
	//Gerando um erro de StackOverFlow
	public static void recursividade() {
		recursividade();
	}
}
