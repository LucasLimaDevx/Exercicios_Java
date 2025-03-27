package problema_5.entities;

public abstract class Veiculo {
	private String modelo;
	private String marca;
	private Integer ano;
	private Double capacidadeTanque;
	
	public Veiculo() {
		
	}

	public Veiculo(String modelo, String marca, Integer ano, Double capacidadeTanque) {
	
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.capacidadeTanque = capacidadeTanque;
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

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(Double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public abstract Double calcularConsumo();
	
	
}
