package pacote.cursodevdojo.javacore.polimorfismo.test;

import pacote.cursodevdojo.javacore.polimorfismo.model.*;
import pacote.cursodevdojo.javacore.polimorfismo.repository.*;


public class RepositorioTest {

	public static void main(String[] args) {
		//Utilizando variáveis de referência específicas
		RepositorioBD bd = new RepositorioBD();
		bd.salvar();
		RepositorioMemoria m = new RepositorioMemoria();
		m.salvar();
		RepositorioArquivo ar = new RepositorioArquivo();
		ar.salvar();
		String txt = new String("Ola");
		String txt2 = txt;
		txt = "Sera";
		System.out.println(txt2);
		//Usando variáveis de referência genéricas
		Repositorio repositorio = new RepositorioBD();
		repositorio.salvar();
		repositorio = new RepositorioArquivo();
		repositorio.salvar();
		repositorio = new RepositorioMemoria();
		repositorio.salvar();
	}

}
