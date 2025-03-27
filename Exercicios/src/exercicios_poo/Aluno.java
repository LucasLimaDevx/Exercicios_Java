package exercicios_poo;

public class Aluno {
	private String nome;
	private Integer matricula;
	private Double nota;
	
	public Aluno(String nome, Integer matricula, Double nota) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	
	
	
}
