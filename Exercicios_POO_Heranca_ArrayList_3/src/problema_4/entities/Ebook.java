package problema_4.entities;

public class Ebook extends Livro{
	private Integer tamanhoDoArquivo;
	
	public Ebook() {
		super();
	}
	
	public Ebook(String titulo, Integer tamanhoDoArquivo) {
		super(titulo);
		this.tamanhoDoArquivo = tamanhoDoArquivo;
	}

	public Ebook(String titulo, String autor, Integer tamanhoDoArquivo) {
		super(titulo, autor);
		this.tamanhoDoArquivo = tamanhoDoArquivo;
	}

	public Integer getTamanhoDoArquivo() {
		return tamanhoDoArquivo;
	}

	public void setTamanhoDoArquivo(Integer tamanhoDoArquivo) {
		this.tamanhoDoArquivo = tamanhoDoArquivo;
	}
	
	
}
