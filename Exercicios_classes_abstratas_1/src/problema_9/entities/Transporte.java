package problema_9.entities;

public abstract class Transporte {
	private String modelo;
	private String marca;
	private Integer capacidade;
	private Double tarifaBase;
	
	public Transporte() {
		
	}

	public Transporte(String modelo, String marca, Integer capacidade, Double tarifaBase) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.capacidade = capacidade;
		this.tarifaBase = tarifaBase;
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

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Double getTarifaBase() {
		return tarifaBase;
	}

	public void setTarifaBase(Double tarifaBase) {
		this.tarifaBase = tarifaBase;
	}
	
	public abstract Double calcularCusto();
	
	
	
}
