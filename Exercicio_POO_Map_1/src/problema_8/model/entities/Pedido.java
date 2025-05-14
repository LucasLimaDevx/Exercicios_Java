package problema_8.model.entities;

import java.util.Objects;

public class Pedido {
	private String id;
	private Double valor;
	private Boolean entregue;
	
	public Pedido(String id, Double valor, Boolean entregue) {
	
		this.id = id;
		this.valor = valor;
		this.entregue = entregue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Boolean getEntregue() {
		return entregue;
	}

	public void setEntregue(Boolean entregue) {
		this.entregue = entregue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(entregue, id, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(entregue, other.entregue) && Objects.equals(id, other.id)
				&& Objects.equals(valor, other.valor);
	}
	
	
	
}
