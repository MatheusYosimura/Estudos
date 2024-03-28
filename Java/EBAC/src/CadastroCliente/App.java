package CadastroCliente;
import javax.swing.JOptionPane;

public class App {
	private static IClienteDAO IclienteDAO;
	
	public static void main (String args []) {
		IclienteDAO = new MapImplementacao();
		int menu = 0;
		do {
			menu = Integer.valueOf(JOptionPane.showInputDialog("Escolha uma opção:\n"
					+ "1 - Cadastrar Cliente\n"
					+ "2 - Consultar Cliente\n"
					+ "3 - Excluir Cliente\n"
					+ "4 - Alterar Cliente\n"
					+ "5 - Sair"));
			switch(menu){
				case 1 :
					String aux1 = JOptionPane.showInputDialog("Insira os dados do usuário separados por vírgula\n"
							+ "Nome,Cpf,Telefone,Endereço,Número,Cidade,Estado\n");
					String[] dados1 = aux1.split(",");
					System.out.println(dados1[0] + dados1[6]);
					Cliente cliente1 = new Cliente (dados1[0], Long.valueOf(dados1[1]), Long.valueOf(dados1[2]),dados1[3],Integer.valueOf(dados1[4]),dados1[5],dados1[6]);
					System.out.println(cliente1);
					if(IclienteDAO.cadastrar(cliente1)==true) {
						JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso");
					}else {
						JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente\n Tente novamente");
					}
					break;
				case 2 :
					Cliente cliente2 = IclienteDAO.consultar(Long.valueOf(JOptionPane.showInputDialog("Insira o CPF do Cliente:")));
					if (cliente2 != null) {
						JOptionPane.showMessageDialog(null, cliente2);
					}else {
						JOptionPane.showMessageDialog(null, "Cliente Não Encontrado\nTente Novamente");
					}
					break;
				case 3:
					Cliente cliente3 = IclienteDAO.consultar(Long.valueOf(JOptionPane.showInputDialog("Insira o CPF do Cliente:")));
					if (cliente3 != null) {
						IclienteDAO.excluir(cliente3.getCpf());
						JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");
					}else {
						JOptionPane.showMessageDialog(null, "Cliente Não Encontrado\nTente Novamente");
					}
					break;
				case 4:
					Cliente cliente4 = IclienteDAO.consultar(Long.valueOf(JOptionPane.showInputDialog("Insira o CPF do Cliente:")));
					if(cliente4!=null) {
						String aux4 = JOptionPane.showInputDialog("Insira os dados do usuário separados por vírgula\n"
								+ "Nome,Telefone,Endereço,Número,Cidade,Estado\n");
						String[] dados4 = aux4.split(",");
						cliente4 = new Cliente(dados4[0], cliente4.getCpf(), Long.valueOf(dados4[1]),dados4[2],Integer.valueOf(dados4[3]),dados4[4],dados4[5]);
						IclienteDAO.alterar(cliente4);
						JOptionPane.showMessageDialog(null, "Cliente Alterado com Sucesso\n" + cliente4);
					}else {
						JOptionPane.showMessageDialog(null, "Cliente Não Encontrado\nTente Novamente");
					}
					break;
				case 5:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Invalida\nTente Novamente");
			}
		}while (menu!=5);
	}
	
}
