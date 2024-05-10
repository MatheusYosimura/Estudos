package pacote.cursodevdojo.javacore.introducaoclasses.test;
import pacote.cursodevdojo.javacore.introducaoclasses.model.*;

public class ExercicioCarroTest {
	public static void main (String[] args) {
		ExerciocioCarro carro1 = new ExerciocioCarro();
		ExerciocioCarro carro2 = new ExerciocioCarro();
		carro1.nome = "Peugeot";
		carro2.nome = "Hyundai";
		carro1.modelo = "2008";
		carro2.modelo = "Creta";
		carro1.ano = 2022;
		carro2.ano = 2023;
		System.out.println("Marca: "+carro1.nome+" | Modelo: "+carro1.modelo+" | Ano: "+carro1.ano);
		System.out.println("Marca: "+carro2.nome+" | Modelo: "+carro2.modelo+" | Ano: "+carro2.ano);
		carro1 = carro2;
		carro1.nome = "TESTE";
		System.out.println("Marca: "+carro1.nome+" | Modelo: "+carro1.modelo+" | Ano: "+carro1.ano);
		System.out.println("Marca: "+carro2.nome+" | Modelo: "+carro2.modelo+" | Ano: "+carro2.ano);
	}
}
