package problema_5.model.application;

import java.util.Locale;

import problema_5.model.entities.ConversorDeDistancia;
import problema_5.model.entities.ConversorDeTemperatura;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ConversorDeTemperatura t1 = new ConversorDeTemperatura();
		System.out.println(String.format("%.2f", t1.conveter(0.0)) + "°F");
		
		ConversorDeTemperatura t2 = new ConversorDeTemperatura();
		System.out.println(String.format("%.2f", t2.conveter(100.0)) + "°F");
		
		ConversorDeDistancia d1 = new ConversorDeDistancia();
		System.out.println(String.format("%.2f", d1.conveter(10.0)) + " mi");
		
		ConversorDeDistancia d2 = new ConversorDeDistancia();
		System.out.println(String.format("%.2f", d2.conveter(50.0)) + " mi");

	}

}
