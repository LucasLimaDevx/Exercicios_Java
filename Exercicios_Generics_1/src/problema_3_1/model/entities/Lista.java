package problema_3_1.model.entities;

import java.util.ArrayList;

public class Lista<T> {
	ArrayList<T> lista = new ArrayList<T>();

	public ArrayList<T> getLista() {
		return lista;
	}
	

	public void listar() {
		for(T e : lista) {
			System.out.println(e);
		}
	}
	
}
