/**
*@author MatheusYosimura
**/
package CadastroCliente;

import java.util.Collection;

public interface IClienteDAO {
	public Boolean cadastrar (Cliente cliente);
	public void excluir(Long cpf);
	public void alterar (Cliente cliente);
	public Cliente consultar(Long cpf);
	public Collection<Cliente> buscarTodos();
	public boolean isCamposValidos(String[] dados1);
	public boolean isCPFValido(String cpf);
}
