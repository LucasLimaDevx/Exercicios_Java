package problema_2.entities;

public class Veiculo {
	public String modelo;
	public Integer ano;
	
	public Veiculo() {		
	}

	public Veiculo(String modelo, Integer ano) {
		this.modelo = modelo;
		this.ano = ano;
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
	
	
}
