package problema_7.entities;

public class Pedido {
	private Integer id;
	private Double valor;
	
	public Pedido() {
	}

	public Pedido(Integer id, Double valor) {
		
		this.id = id;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
}
