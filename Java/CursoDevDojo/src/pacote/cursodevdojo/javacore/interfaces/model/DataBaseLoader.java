package pacote.cursodevdojo.javacore.interfaces.model;

public class DataBaseLoader implements DataLoader,DataRemove{
	public void load() {
		System.out.println("Carregando dados do DB"); 
	}
	public void remove() {
		System.out.println("Removendo dados do DB"); 
	}
	@Override
	public void checkPermition() {
		System.out.println("Checkando permissões"); 		
	}
	@Override
	public void checkPermition2() {
		DataLoader.super.checkPermition2();
		System.out.println("Check Permition na classe");
	}
	public static void metodoStatic() {
		System.out.println("Dentro do método estático da classe");
	}
}
