package exercicios_enum;

public class Aluno {
	private String nome;
	private Double nota;
	private Situacao situacao = Situacao.EM_ANALISE;
	
	public Aluno(String nome) {
		
		this.nome = nome;
		
	}
	
	public Aluno(String nome, Double nota, Situacao situacao) {
		
		this.nome = nome;
		this.nota = nota;
		this.situacao = situacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
	
	
	
	
}
