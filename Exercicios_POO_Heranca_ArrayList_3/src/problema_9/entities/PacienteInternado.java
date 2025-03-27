package problema_9.entities;

public class PacienteInternado extends Paciente{
	private String quarto;
	
	public PacienteInternado() {
		super();
	}

	public PacienteInternado(String nome, Integer idade, String quarto) {
		super(nome, idade);
		this.quarto = quarto;
	}

	public String getQuarto() {
		return quarto;
	}

	public void setQuarto(String quarto) {
		this.quarto = quarto;
	}
	
	
}
