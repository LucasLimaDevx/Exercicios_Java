package problema_9.model.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Palavra {
	private List<String> palavras;

	public Palavra(List<String> palavras) {
		super();
		this.palavras = palavras;
	}

	public List<String> getPalavras() {
		return palavras;
	}
	
	
	public List<String> verificaPalindormo() {
		return palavras
				.stream()
				.filter(palavra -> {
					
					return String.join("",  Arrays.asList(palavra.split("")).reversed()).equals(palavra);
				})
				.collect(Collectors.toList());
	}
	
	
	
}
