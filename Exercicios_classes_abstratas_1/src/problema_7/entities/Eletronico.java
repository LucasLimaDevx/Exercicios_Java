package problema_7.entities;

public abstract class Eletronico {
	private String modelo;
	protected String marca;
	protected Double potencia;
	private Double voltagem;
	
	public Eletronico() {
		
	}

	public Eletronico(String modelo, String marca, Double potencia, Double voltagem) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.potencia = potencia;
		this.voltagem = voltagem;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	public Double getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(Double voltagem) {
		this.voltagem = voltagem;
	}
	
	public abstract Double calcularConsumo();
	
}
