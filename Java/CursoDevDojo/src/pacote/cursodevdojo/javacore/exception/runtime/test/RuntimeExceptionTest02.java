package pacote.cursodevdojo.javacore.exception.runtime.test;

public class RuntimeExceptionTest02 {
	public static void main (String[] args) {
		try{
			divisao(1,0);
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("Resto do códgio");
	}
	private static int divisao(int a, int b) {
		if(b==0) {
			throw new IllegalArgumentException("Argumento Inválido = Divisão por zero");
		}
		return a/b;
	}
}
