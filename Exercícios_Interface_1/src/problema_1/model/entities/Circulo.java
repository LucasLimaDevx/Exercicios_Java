package problema_1.model.entities;

import problema_1.model.interfaces.Figura;

public class Circulo implements Figura{
	private double raio;
	public static final double PI = 3.14159;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		
		return PI * raio * raio;
	}

	@Override
	public double perimetro() {
		double diametro = 2 * raio;
		return PI * diametro;
	}
	
}
