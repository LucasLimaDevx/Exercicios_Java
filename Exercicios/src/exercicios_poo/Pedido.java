package exercicios_poo;

public class Pedido {
	private String numero;
	private String nome;
	private Double valorTotal;
	
	public Pedido(String numero, String nome, Double valorTotal) {
		
		this.numero = numero;
		this.nome = nome;
		this.valorTotal = valorTotal;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
