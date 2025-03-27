package problema_2.entities;

import problema_2.enums.TipoDeVeiculo;

public abstract class Veiculo {
	private TipoDeVeiculo veiculo;
	protected Double valor;
	
	public Veiculo() {
		
	}

	public Veiculo(TipoDeVeiculo veiculo, Double valor) {
		
		this.veiculo = veiculo;
		this.valor = valor;
	}

	public TipoDeVeiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(TipoDeVeiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public abstract Double calcularImposto();
	
	
}
