package exercicios_poo;

public class Livro {
	private String titulo;
	private String autor;
	private Integer anoDePublicacao;
	
	public Livro(String titulo, String autor, Integer anoDePublicacao) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String nome) {
		this.titulo = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Integer anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	@Override
	public String toString() {
		return getTitulo() + ", Autor: " + getAutor() +", Ano: " + getAnoDePublicacao();
	}
	
	
	
	
	
}
