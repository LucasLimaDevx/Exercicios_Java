package entities;

public class DescontoSimples {
	private double valorNominal;
	private double taxaDesconto;
	private int tempo;
	
	public DescontoSimples(double valorNominal, double taxaDesconto, int tempo) {
		this.valorNominal = valorNominal;
		this.taxaDesconto = taxaDesconto;
		this.tempo = tempo;
	}

	public double getValorNominal() {
		return valorNominal;
	}

	public void setValorNominal(double valorNominal) {
		this.valorNominal = valorNominal;
	}

	public double getTaxaDesconto() {
		return taxaDesconto;
	}

	public void setTaxaDesconto(double taxaDesconto) {
		this.taxaDesconto = taxaDesconto;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public double descontoSimples() {
		return getValorNominal() * (getTaxaDesconto() / 100.0) * getTempo();
	}
	
	public double valorLiquido() {
		return getValorNominal() - descontoSimples();
	}
	
	public String compararValorNominalComValorMinimo(double valorNominalMinimo) {
		if(valorLiquido() > valorNominalMinimo) {
			
			return "O valor líquido é maior que o valor mínimo aceito.";
			
		}else if(valorLiquido() == valorNominalMinimo) {
			
			return "O valor líquido é igual que o valor mínimo aceito.";
			
		}
		
		return "O valor líquido é menor que o valor mínimo aceito.";
	}
	
	
	
	
	
	
}
