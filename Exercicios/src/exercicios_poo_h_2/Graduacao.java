package exercicios_poo_h_2;

public class Graduacao extends Estudante{
	
	private String tipo = "Graduação";
	
	public Graduacao() {
		super();
	}

	public Graduacao(String nome, String curso) {
		super(nome, curso);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
