package problema_1.model.entities;

import java.util.Objects;

public class Aluno {
	private String nome;
	private Double notaFinal;
	private Integer matricula;
	
	public Aluno(String nome, Double notaFinal, Integer matricula) {
		this.nome = nome;
		this.notaFinal = notaFinal;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Double notaFinal) {
		this.notaFinal = notaFinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, notaFinal);
	}
	
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(notaFinal, other.notaFinal);
	}
	
	
}
