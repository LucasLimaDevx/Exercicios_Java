package entities;

public class Circulo_2 {
	public double raio;
	public double raioComparativo;
	public final double PI = 3.14159;
	
	public double areaDoCirculo() {
		
		return PI * raio*raio;
		
	}
	
	public double perimetroDoCirculo() {
		return 2 * PI * raio;
	}
	
	public String compararCircufenrencias() {
		if(raio >= raioComparativo) {
			return "Sim";
		}
		else {
			return "Não";
		}
	}
}
