package CadastroCliente;
import javax.*;

public class App {
	private static IClienteDAO IclienteDAO;
	
	public static void main (String args []) {
		IclienteDAO = new MapImplementacao();
		
	}
	
}
