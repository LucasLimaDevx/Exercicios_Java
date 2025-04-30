package problema_8.model.entities;

import java.util.ArrayList;
import java.util.List;

public class FiltroLista<T> {
	private List<T> filtroDaLista = new ArrayList<T>();
	
	public void filtrarLista(List<T> lista) {
		
		for(T e : lista) {
			if(e instanceof Integer) {
				if( ((Integer) e).compareTo(2) == 1) {
					filtroDaLista.add(e);
				}
			}
			if(e instanceof String) {
				String s = (String) e;
				Integer len = s.length();
				
				if( len.compareTo(1) == 1) {
					filtroDaLista.add(e);
				}
			}
			if(e instanceof Double) {
				
				if( ((Double) e).compareTo(3.0) == -1) {
					filtroDaLista.add(e);
				}
			}
			
			if(e instanceof Boolean) {
				
				if( ((Boolean) e).compareTo(true) == 0) {
					filtroDaLista.add(e);
				}
			}
			
		}
		
		
		
		
	}

	public List<T> getFiltroDaLista() {
		return filtroDaLista;
	}


	
	
	
}
