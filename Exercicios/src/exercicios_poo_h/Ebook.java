package exercicios_poo_h;

public class Ebook extends Livro{
	private TipoDoLivro tipo;
	
	public Ebook() {
		
	}

	public Ebook(String titulo, TipoDoLivro tipo) {
		super(titulo);
		this.tipo = tipo;
	}

	public TipoDoLivro getTipo() {
		return tipo;
	}

	public void setTipo(TipoDoLivro tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ebook: \"" + getTitulo() + "\" adicionado ao catálogo";
	}
	
	
}
