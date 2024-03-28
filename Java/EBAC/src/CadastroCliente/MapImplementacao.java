package CadastroCliente;
import java.util.*;

public class MapImplementacao implements IClienteDAO{
	private Map<Long, Cliente> clientes = new HashMap<Long, Cliente>();
	
	public Boolean cadastrar(Cliente cliente) {
		if(cliente != null) {
			clientes.put(cliente.getCpf(), cliente);
			return true;
		}
		return false;
	}

	public void excluir(Long cpf) {
		Cliente aux = consultar(cpf);
		if (aux!=null) {
			this.clientes.remove(cpf);
		}
	}

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

	public Cliente consultar(Long cpf) {
		
		Cliente aux = this.clientes.get(cpf);
		if(aux!=null) {
			return aux;
		}
		return null;
	}

	public Collection<Cliente> buscarTodos() {
		return this.clientes.values();
	}
	
	public boolean isCamposValidos(String [] dados){
		for(String i : dados) {
			if(i == null || "".equals(i)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isCPFValido(String cpf) {
		if(cpf == null || "".equals(cpf)) {
			return false;
		}
		return true;
	}

}
