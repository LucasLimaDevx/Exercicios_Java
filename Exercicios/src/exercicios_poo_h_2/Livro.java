package exercicios_poo_h_2;

public class Livro {
	private String titulo;
	private String autor;
	private Integer quantidadeDePagis;
	private TipoDoLivro tipoDoLivro;
	
	public Livro(){
		
	}

	

	public Livro(String titulo, String autor, Integer quantidadeDePagis, TipoDoLivro tipoDoLivro) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.quantidadeDePagis = quantidadeDePagis;
		this.tipoDoLivro = tipoDoLivro;
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

	public Integer getQuantidadeDePagis() {
		return quantidadeDePagis;
	}

	public void setQuantidadeDePagis(Integer quantidadeDePagis) {
		this.quantidadeDePagis = quantidadeDePagis;
	}
	
	public TipoDoLivro getTipoDoLivro() {
		return tipoDoLivro;
	}


	public void setTipoDoLivro(TipoDoLivro tipoDoLivro) {
		this.tipoDoLivro = tipoDoLivro;
	}



	@Override
	public String toString() {
		return titulo + " - " + autor + " - " + quantidadeDePagis + " páginas";
	}
	
	
	
	
	
}
