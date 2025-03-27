package exercicios_enum;

public class Veiculo {
	private String placa;
	private String modelo;
	private Status_3 status;
	
	public Veiculo(String placa, String modelo, Status_3 status) {
	
		this.placa = placa;
		this.modelo = modelo;
		this.status = status;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlace(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Status_3 getStatus() {
		return status;
	}

	public void setStatus(Status_3 status) {
		this.status = status;
	}
	
	
	
	

}
