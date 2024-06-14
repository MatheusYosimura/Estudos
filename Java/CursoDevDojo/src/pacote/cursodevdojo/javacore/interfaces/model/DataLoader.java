package pacote.cursodevdojo.javacore.interfaces.model;

public interface DataLoader {
	public static final int TAMANHO_MAXIMO_DADOS = 1000;
	void load();
	void checkPermition();
	//Exemplo método concreto
	default void checkPermition2() {
		System.out.println("Check Permition na nível interface");
	}
	static void metodoStatic() {
		System.out.println("Dentro do método estático da interface");
	}
}
