package pacote.cursodevdojo.javacore.polimorfismo.test;

import pacote.cursodevdojo.javacore.polimorfismo.model.*;
import pacote.cursodevdojo.javacore.polimorfismo.controller_servico.*;


public class ProdutoTest02 {
	public static void main (String[] args) {
		Produto produto1 = new Computador("PC01", 1000);
		Produto produto2 = new Tomate("Siciliano",10);
		
		//Tomate produto3 = (Tomate) new Produto("Tomatee",5);
		Tomate produto4 = new Tomate("Cereja",13);
		CalculadorImposto.computador((Computador)produto1);//Casting necessário pois a var_ref é do tipo Produto e o parâmetro pede um do tipo Computador
		CalculadorImposto.tomate((Tomate)produto2);//Casting necessário pois a var_ref é do tipo Produto e o parâmetro pede um do tipo Tomate		
		//System.out.println(produto2.getValidade()); Não funciona pois a referência não consegue acessar o método getValidade();
		CalculadorImposto.tomate(produto4);//Não precisa de casting pois a var_ref é do msm tipo do parâmetro pedido
		System.out.println(produto4.getValidade());
		//USANDO MÉTODO QUE RECEBE COMO PARÂMETRO A VARIÀVEL DE REFERÊNCIA DO TIPO PRODUTO
		CalculadorImposto.produto(produto1);
		CalculadorImposto.produto(produto2);
		CalculadorImposto.produto(produto4);
		Televisão tv1 = new Televisão ("Tv1",1000);
		Produto tv2 = new Televisão("Tv2",1500);
		CalculadorImposto.produto(tv1);
		CalculadorImposto.produto(tv2);
	}
}
