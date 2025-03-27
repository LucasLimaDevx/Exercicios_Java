package problema_1.entities;

public class Circulo extends Figura {
	public static final Double PI = 3.14159;
	private Double raio;
	
	public Circulo(String cor, String nome, Double raio) {
		super(cor, nome);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double calcularArea() {
		// TODO Auto-generated method stub
		return PI * raio * raio;
	}
	

	
	
}
