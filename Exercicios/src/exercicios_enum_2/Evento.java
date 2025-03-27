package exercicios_enum_2;

public class Evento {
	private String nome;
	private String local;
	private Tipo tipo;
	
	public Evento(String nome, String local, Tipo tipo) {
		
		this.nome = nome;
		this.local = local;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
