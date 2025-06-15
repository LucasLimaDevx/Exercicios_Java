package problema_3.model.entities;

import problema_3.model.interfaces.Operacao;

public class Subtracao implements Operacao {
	private Double valor_1;
	private Double valor_2;
	
	public Subtracao(Double valor_1, Double valor_2) {
		
		this.valor_1 = valor_1;
		this.valor_2 = valor_2;
	}

	public Double getValor_1() {
		return valor_1;
	}

	public void setValor_1(Double valor_1) {
		this.valor_1 = valor_1;
	}

	public Double getValor_2() {
		return valor_2;
	}

	public void setValor_2(Double valor_2) {
		this.valor_2 = valor_2;
	}

	@Override
	public Double executarOperacao() {
		
		return valor_1 - valor_2;
	}
	
	
	
	
}
