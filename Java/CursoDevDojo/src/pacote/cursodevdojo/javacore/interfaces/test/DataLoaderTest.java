package pacote.cursodevdojo.javacore.interfaces.test;

import pacote.cursodevdojo.javacore.interfaces.model.*;

public class DataLoaderTest {

	public static void main(String[] args) {
		DataBaseLoader dbl = new DataBaseLoader();
		FileLoader fl = new FileLoader();
		dbl.load();
		fl.load();
		dbl.remove();
		dbl.checkPermition();
		fl.checkPermition();
		dbl.checkPermition2();
		fl.checkPermition2();
		DataLoader.metodoStatic();
		DataBaseLoader.metodoStatic();
	}

}