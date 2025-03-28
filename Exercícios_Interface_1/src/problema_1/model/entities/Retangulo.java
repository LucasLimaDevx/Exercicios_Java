package problema_1.model.entities;

import problema_1.model.interfaces.Figura;

public class Retangulo implements Figura{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return base * altura;
	}
	

}
