package problema_6.model.entities;

import java.util.Objects;

public class Carro {
	private String placa;
	
	
	public Carro(String placa) {
		this.placa = placa;
	}

	
	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	@Override
	public int hashCode() {
		return Objects.hash(placa);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(placa, other.placa);
	}
	
	
}
