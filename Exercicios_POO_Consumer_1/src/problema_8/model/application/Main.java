package problema_8.model.application;

import java.util.List;
import java.util.function.Consumer;

import problema_8.model.entities.Cliente;

public class Main {

	public static void main(String[] args) {
		List<Cliente> clientes = List.of(
			new Cliente(" João "),
			new Cliente(" Ana "),
			new Cliente(" Marcos "),
			new Cliente(" Carla ")
		);
		
		Consumer<Cliente> cons = (c) -> c.setNome(c.getNome().trim());
		
		clientes.forEach(cons);
		
		for(int i = 0 ; i < clientes.size() ; i++) {
			System.out.println(clientes.get(i).getNome());
		}
		

	}

}
