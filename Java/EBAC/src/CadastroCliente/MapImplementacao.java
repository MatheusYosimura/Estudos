package CadastroCliente;
import java.util.*;

public class MapImplementacao implements IClienteDAO{
	private Map<Long, Cliente> clientes;
	
	@Override
	public Boolean cadastrar(Cliente cliente) {
		if(cliente != null) {
			clientes.put(cliente.getCpf(), cliente);
			return true;
		}
		return false;
	}

	@Override
	public void excluir(Long cpf) {
		Cliente aux = consultar(cpf);
		if (aux!=null) {
			this.clientes.remove(cpf);
		}
	}

	@Override
	public void alterar(Cliente cliente) {
		Cliente aux = consultar(cliente.getCpf());
		if(aux!=null) {
			aux.setNome(cliente.getNome());
			aux.setCidade(cliente.getCidade());
			aux.setEndereco(cliente.getEndereco());
			aux.setEstado(cliente.getEstado());
			aux.setNumero(cliente.getNumero());
			aux.setTelefone(cliente.getTelefone());
			//excluir(cliente.getCpf());
			//this.clientes.put(aux.getCpf(),aux);
		}
		
	}

	@Override
	public Cliente consultar(Long cpf) {
		Cliente aux = this.clientes.get(cpf);
		if(aux!=null) {
			return aux;
		}
		return null;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		return this.clientes.values();
	}

}
