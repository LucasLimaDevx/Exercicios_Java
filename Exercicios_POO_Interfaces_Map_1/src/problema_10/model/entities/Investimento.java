package problema_10.model.entities;

public class Investimento {
	private String investimento;
	private Double valor;
	private Integer tempo;
	private Double taxa;
	
	public Investimento(String investimento, Double valor, Integer tempo, Double taxa) {

		this.investimento = investimento;
		this.valor = valor;
		this.tempo = tempo;
		this.taxa = taxa;
	}

	public String getInvestimento() {
		return investimento;
	}

	public void setInvestimento(String investimento) {
		this.investimento = investimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getAnos() {
		return tempo;
	}

	public void setAnos(Integer tempo) {
		this.tempo = tempo;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double calcularMontante() {
		return valor * Math.pow((1.0 + taxa / 100.0 ), tempo);
	}
	
	
}
