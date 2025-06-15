package problema_4.model.entities;

import java.util.List;

public class Aluno {
	private String nome;
	private Integer idade;
	private List<Double> notas;
	
	public Aluno(String nome, Integer idade, List<Double> notas) {
		
		this.nome = nome;
		this.idade = idade;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	
	public Double calcularMediaFinal() {
		return notas.stream()
				.reduce(0.0, (nota_1, nota_2) -> nota_1 + nota_2) / notas.size();
	
	}
	
}
