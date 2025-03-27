package entities;

public class Triangulo {
	public double base;
	public double altura;
	
	public double areaDoTriangulo() {
		return base * altura / 2;
	}
	
	public double hipotenusaDoTriangulo() {
		return Math.sqrt( base*base + altura*altura);
	}
}
