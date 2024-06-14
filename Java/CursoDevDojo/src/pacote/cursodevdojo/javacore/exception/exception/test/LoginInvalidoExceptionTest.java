package pacote.cursodevdojo.javacore.exception.exception.test;
import java.util.*;

import pacote.cursodevdojo.javacore.exception.model.LoginInvalidoException;

public class LoginInvalidoExceptionTest {

	public static void main(String[] args) {
		try{
			login();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void login() throws Exception{
		String n = "Eu", s = "Juliana";
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite a senha: ");
		String senha = sc.nextLine();
		if(!n.equals(nome) || !s.equals(senha)) {
			throw new LoginInvalidoException("AXALALALALALALA");
		}
		System.out.println("Login realizado com Sucesso");
	}
}
