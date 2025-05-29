package problema_5.model.entities;

import java.util.List;
import java.util.stream.Collectors;

public class OperacaoMatematica {
	public static Integer soma(List<Integer> lista) {
		Integer soma = 0;
		
		List<Integer> novaLista = lista.stream().map( x -> x *x).collect(Collectors.toList());
		
		for(Integer numero : novaLista) {
			soma += numero;
		}
		return soma;
	}
}
