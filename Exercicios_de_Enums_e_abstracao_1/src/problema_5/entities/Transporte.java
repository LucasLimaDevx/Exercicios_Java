package problema_5.entities;

import problema_5.enums.TipoDeTransporte;

public abstract class Transporte {
	protected Double distancia;
	private TipoDeTransporte tipoDeTransporte;
	
	public Transporte() {
		
	}

	public Transporte(Double distancia, TipoDeTransporte tipoDeTransporte) {
		
		this.distancia = distancia;
		this.tipoDeTransporte = tipoDeTransporte;
	}
	
	
	
	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	public TipoDeTransporte getTipoDeTransporte() {
		return tipoDeTransporte;
	}

	public void setTipoDeTransporte(TipoDeTransporte tipoDeTransporte) {
		this.tipoDeTransporte = tipoDeTransporte;
	}

	public abstract Double calcularPassagem();
	
	
}
