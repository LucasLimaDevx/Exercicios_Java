package exercicios_poo_h_2;

public class Pagamento {
	private Double valor;
	private String data;
	
	
	public Pagamento() {
		
	}

	public Pagamento(Double valor, String data) {
	
		this.valor = valor;
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
}
