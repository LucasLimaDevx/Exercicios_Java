package entities;

public class Circulo {
	public final double PI = 3.14159;
	public double raio;
	
	public double areaDoCirculo() {
		return PI * raio*raio;
	}
	public  double perimetroDoCirculo() {
		return 2 * PI * raio;
	}
}
