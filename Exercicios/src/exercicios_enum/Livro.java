package exercicios_enum;

public class Livro {
	private String titulo;
	private String autor;
	private Status status;
	
	public Livro(String titulo, String autor, Status status) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.status = status;
		
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
}
