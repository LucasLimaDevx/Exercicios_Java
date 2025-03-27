package exercicios_poo_h_2;

public class PosGraduacao extends Estudante{
	private String tipo = "Pós-Graduação";
	
	public PosGraduacao() {
		super();
	}

	
	public PosGraduacao(String nome, String curso) {
		super(nome, curso);
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
