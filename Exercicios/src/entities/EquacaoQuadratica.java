package entities;

public class EquacaoQuadratica {
	public double a;
	public double b;
	public double c;
	
	public String calcularRaizes() {
		
		double delta = b*b - 4 * a *c;
		double raiz1 = (-b-Math.sqrt(delta))/2.0 * a;
		double raiz2 = (-b+Math.sqrt(delta))/2.0 * a;
		
		return "x1 = " + raiz1 + ", x2 = " + raiz2;
	}
}
