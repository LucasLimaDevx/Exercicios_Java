package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private String nome;
	private List<Double> notas = new ArrayList<>();
	
	public Disciplina(String nome, List<Double> notas) {
	
		this.nome = nome;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Double> getNotas() {
		return notas;
	}
	
	public String calcularMedia() {
		Double soma = 0.0;
		
		for(Double nota : notas) {
			soma += nota;
		}
		
		return String.format("%.2f", soma / notas.size());
	}
	
}
