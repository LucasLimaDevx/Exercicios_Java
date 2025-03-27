package exercicios_poo_h_2;

public class Estudante {
	private String nome; 
	private String curso;
	
	public Estudante() {
		
	}

	public Estudante(String nome, String curso) {
		
		this.nome = nome;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
