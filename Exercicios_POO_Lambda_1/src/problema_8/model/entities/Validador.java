package problema_8.model.entities;

import java.util.List;

public class Validador {
	private List<Integer> lista;
	
	public Validador(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getLista() {
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}
	
	public boolean verificaNumerosPositivos() {
		return this.lista.stream().allMatch(number -> number > 0);
	}
}
