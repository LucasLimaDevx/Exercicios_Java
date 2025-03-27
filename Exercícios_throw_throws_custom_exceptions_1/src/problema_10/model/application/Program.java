package problema_10.model.application;

import problema_10.model.entities.Cliente;
import problema_10.model.exception.ClienteNaoEncontradoException;

public class Program {

	public static void main(String[] args) {
		CadastroDeCliente sistema = new CadastroDeCliente();
		Cliente c1 = new Cliente("Lucas", "12345678901");
		Cliente c2 = new Cliente("Wallace","01987654321");
		
		sistema.adicionarCliente(c1);
		sistema.adicionarCliente(c2);
		
		try {
			sistema.procurarCliente("01987654388");
		}
		catch(ClienteNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
