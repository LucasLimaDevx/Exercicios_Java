package exercicios_poo_h;

public class LivroFisico extends Livro{
	private TipoDoLivro tipo;
	
	LivroFisico(){
		super();
	}

	public LivroFisico(String titulo, TipoDoLivro tipo) {
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
		return "Livro: \"" + getTitulo() + "\" adicionado ao catálogo";
	}

	
	
	
	
}
