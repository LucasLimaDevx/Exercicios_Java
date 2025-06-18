package problema_3.model.entities;

public class Livro {
	private String titulo;
	private Integer quantidade;
	
	public Livro(String titulo, Integer quantidade) {
		
		this.titulo = titulo;
		this.quantidade = quantidade;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
}
