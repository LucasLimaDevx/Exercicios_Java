package exercicios_poo_h_2;

public class Produto {
	private String marca;
	private String modelo;
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(String marca, String modelo, Double preco) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
	
}
