package problema_7.model.entities;

import java.util.Objects;

public class Objeto {
	private Integer id;
	
	public Objeto(Integer id) {
		this.id = id;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Objeto other = (Objeto) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

