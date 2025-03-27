package exercicios_poo_h_2;

public class Transporte {
	private String origem;
	private String destino;
	private Double valor;
	
	public Transporte() {
		
	}

	public Transporte(String origem, String destino, Double valor) {
	
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
