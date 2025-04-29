package problema_8.model.application;

import java.util.List;

import problema_8.model.entities.FiltroLista;

public class Main {

	public static void main(String[] args) {
		FiltroLista<Integer> fl1 = new FiltroLista<Integer>();
		FiltroLista<String> fl2 = new FiltroLista<String>();
		FiltroLista<Double> fl3 = new FiltroLista<Double>();
		FiltroLista<Boolean> fl4 = new FiltroLista<Boolean>();
		
		fl1.filtrarLista(List.of(1,2,3,4));
		fl2.filtrarLista(List.of("a", "bb", "ccc"));
		fl3.filtrarLista(List.of(2.5, 1.2, 4.4));
		fl4.filtrarLista(List.of(true, false));
		
		System.out.println(fl1.getFiltroDaLista());
		System.out.println(fl2.getFiltroDaLista());
		System.out.println(fl3.getFiltroDaLista());
		System.out.println(fl4.getFiltroDaLista());
	}

}
