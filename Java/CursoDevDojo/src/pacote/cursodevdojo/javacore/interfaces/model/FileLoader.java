package pacote.cursodevdojo.javacore.interfaces.model;

public class FileLoader implements DataLoader{
	public void load() {
		System.out.println("Carregando Arquivos");
	}
	public void checkPermition() {
		System.out.println("Checkando permissões"); 		
	}
}
