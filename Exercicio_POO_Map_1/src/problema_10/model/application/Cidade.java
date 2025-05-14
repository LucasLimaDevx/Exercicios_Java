package problema_10.model.application;

import java.util.List;
import java.util.Objects;

public class Cidade {
	private String nome;
	private List<Double> temperaturas;
	
	public Cidade(String nome, List<Double> temperaturas) {
		
		this.nome = nome;
		this.temperaturas = temperaturas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Double> getTemperaturas() {
		return temperaturas;
	}

	public void setTemperaturas(List<Double> temperaturas) {
		this.temperaturas = temperaturas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, temperaturas);
	}
	
	public Double calcularTemperaturaMedia() {
		if(temperaturas.isEmpty()) {
			return null;
		}
		Double soma = 0.0;
		
		for(Double temperatura : temperaturas) {
			soma += temperatura;
		}
		return soma / temperaturas.size();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(temperaturas, other.temperaturas);
	}
	
	
	
	
}
