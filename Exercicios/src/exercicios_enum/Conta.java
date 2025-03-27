package exercicios_enum;

public class Conta {
	
	private Integer numero;
	private String titular;
	private Tipo tipo;
	
	public Conta(Integer numero, String titular, Tipo tipo) {
		
		this.numero = numero;
		this.titular = titular;
		this.tipo = tipo;
		
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
