package exercicios_enum;

public class Pedido {
	private Integer id;
	private Double valor;
	private Status_2 status;
	
	public Pedido(Integer id, Double valor, Status_2 status) {
	
		this.id = id;
		this.valor = valor;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}


	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Status_2 getStatus() {
		return status;
	}
	public void setStatus(Status_2 status) {
		this.status = status;
	}

	
	
	
	
}
