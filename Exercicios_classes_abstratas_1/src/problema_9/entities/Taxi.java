package problema_9.entities;

public class Taxi extends Transporte{

	private Double distancia;
	
	public Taxi() {
		super();
	}

	public Taxi(String modelo, String marca, Integer capacidade, Double tarifaBase, Double distancia) {
		super(modelo, marca, capacidade, tarifaBase);
		this.distancia = distancia;
	}
	
	
	
	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	@Override
	public Double calcularCusto() {
		// TODO Auto-generated method stub
		return getTarifaBase() * getDistancia();
	}
	
	
}
