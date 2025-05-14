package problema_9.model.entities;

import java.util.Objects;

public class Senha {
	private String usuario;
	private String senha;
	
	public Senha(String usuario, String senha) {
		
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(senha, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Senha other = (Senha) obj;
		return Objects.equals(senha, other.senha) && Objects.equals(usuario, other.usuario);
	}
	
	
	
}
