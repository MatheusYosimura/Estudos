package pacote.cursodevdojo.javacore.exception.model;

public class LoginInvalidoException extends Exception{
	public LoginInvalidoException() {
		super("Login Invalido");
	}
	public LoginInvalidoException(String mensagem) {
		super(mensagem);
	}
}
