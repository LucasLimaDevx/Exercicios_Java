package problema_6.model.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import problema_6.model.entities.Frase;

public class Main {

	public static void main(String[] args) {
		Frase f = new Frase("Desafios estimulam a mente criativa");
		
		String[] arrStr = f.getTexto().split(" ");
		List<String> listaStr = Arrays.asList(arrStr);
		
		int n = 5;
		List<String> listaFiltrada = listaStr.stream().filter(str -> str.length() > n).collect(Collectors.toList());
		
		
		System.out.println(listaFiltrada.size());
	}

}