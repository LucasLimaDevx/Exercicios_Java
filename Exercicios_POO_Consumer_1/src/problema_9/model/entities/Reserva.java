package problema_9.model.entities;

public class Reserva {
	private Integer id;
	private Boolean confirmado;
	
	public Reserva(Integer id, Boolean confirmado) {
	
		this.id = id;
		this.confirmado = confirmado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(Boolean confirmado) {
		this.confirmado = confirmado;
	}
	
	
	
	
}
