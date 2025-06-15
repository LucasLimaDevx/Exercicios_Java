package problema_2.model.entities;

public class Circulo extends FormaGeometrica{
	private Double raio;
	private final Double PI = 3.1415;
	
	public Circulo(Double raio) {
		this.raio = raio;
		
	}

	@Override
	public double calcularArea() {
		
		return PI * raio * raio;
	}

	@Override
	public double calcularPerimetro() {
		
		return 2* PI * raio ;
	}

	@Override
	public String toString() {
		return "Circulo";
	}
	
	
	
	
}
