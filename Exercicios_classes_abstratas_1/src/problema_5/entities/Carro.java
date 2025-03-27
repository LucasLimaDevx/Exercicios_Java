package problema_5.entities;

public class Carro extends Veiculo{
	private Double distancia;
	private Double consumo;
	
	public Carro() {
		super();
	}

	public Carro(String modelo, String marca, Integer ano, Double capacidadeTanque, Double distancia, Double consumo) {
		super(modelo, marca, ano, capacidadeTanque);
		this.distancia = distancia;
		this.consumo = consumo;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	public Double getConsumo() {
		return consumo;
	}

	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}

	@Override
	public Double calcularConsumo() {
		return distancia / consumo;
		
	}
	
	
}
