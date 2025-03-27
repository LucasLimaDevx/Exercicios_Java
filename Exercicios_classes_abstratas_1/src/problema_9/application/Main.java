package problema_9.application;

import java.util.Locale;

import problema_9.entities.Onibus;
import problema_9.entities.Taxi;
import problema_9.entities.Transporte;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Transporte t1 = new Onibus("Marcopolo", "Mercedes", 45, 3.50, 20.0);
		Transporte t2 = new Onibus("Comil", "Scania", 50, 3.50, 50.0);
		Transporte t3 = new Taxi("Corolla", "Toyota", 4, 2.50, 10.0);
		Transporte t4 = new Taxi("Civic", "Honda", 4, 2.50, 30.0);
		
		System.out.println(String.format("%.2f", t1.calcularCusto()));
		System.out.println(String.format("%.2f", t2.calcularCusto()));
		System.out.println(String.format("%.2f", t3.calcularCusto()));
		System.out.println(String.format("%.2f", t4.calcularCusto()));
	}

}
