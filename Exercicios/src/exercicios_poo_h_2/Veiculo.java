package exercicios_poo_h_2;

public class Veiculo {
	private String modelo;
	private Integer ano;
	private Double preco;
	
	public Veiculo() {
		
	}

	public Veiculo(String modelo, Integer ano, Double preco) {
		
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
}
