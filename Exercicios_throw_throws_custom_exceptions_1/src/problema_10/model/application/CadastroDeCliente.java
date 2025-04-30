package problema_10.model.application;

import java.util.ArrayList;
import java.util.List;

import problema_10.model.entities.Cliente;
import problema_10.model.exception.ClienteNaoEncontradoException;

public class CadastroDeCliente {
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void procurarCliente(String cpf) throws ClienteNaoEncontradoException {
		String cliente = null;
		
		for(Cliente c : clientes) {
			if(c.getCpf().equals(cpf)) {
				cliente = c.getNome();
			}
		}
		
		if(cliente == null) {
			throw new ClienteNaoEncontradoException("Cliente não encontrado com o CPF: " + cpf);
		}
		
		System.out.println(cliente + " encontrado com sucesso!");
	}
}
