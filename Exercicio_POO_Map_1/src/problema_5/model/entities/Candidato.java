package problema_5.model.entities;

import java.util.Objects;

public class Candidato {
	private String nome;
	private String partido;
	
	public Candidato(String nome, String partido) {
		this.nome = nome;
		this.partido = partido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, partido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(partido, other.partido);
	}
	
	
}
