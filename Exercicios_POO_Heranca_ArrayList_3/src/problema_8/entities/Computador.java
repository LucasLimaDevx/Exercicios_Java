package problema_8.entities;

public class Computador extends Equipamento{
	private String processador;
	
	public Computador() {
		super();
	}

	public Computador(String nome, String numeroDeSerie, String processador) {
		super(nome, numeroDeSerie);
		this.processador = processador;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	
	
	
}
