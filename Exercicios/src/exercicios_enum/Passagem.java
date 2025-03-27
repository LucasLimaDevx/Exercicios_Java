package exercicios_enum;

public class Passagem {
	private Integer numero;
	private String destino;
	private Classe classe;
	
	public Passagem(Integer numero, String destino, Classe classe) {
		
		this.numero = numero;
		this.destino = destino;
		this.classe = classe;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	
	
	
}
