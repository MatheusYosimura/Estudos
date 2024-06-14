package pacote.cursodevdojo.javacore.polimorfismo.model;

import pacote.cursodevdojo.javacore.polimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando na memória");
	}
}
