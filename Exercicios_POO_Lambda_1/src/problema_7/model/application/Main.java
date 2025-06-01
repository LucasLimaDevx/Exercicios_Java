package problema_7.model.application;

import java.util.Arrays;

import problema_7.model.entities.Temperatura;

public class Main {

	public static void main(String[] args) {
		Temperatura t1 = new Temperatura(Arrays.asList(0.0, 10.0, 20.0));
		Temperatura t2 = new Temperatura(Arrays.asList(-10.0, 0.0, 30.0));
		Temperatura t3 = new Temperatura(Arrays.asList(25.0, 35.0, 45.0));
		Temperatura t4 = new Temperatura(Arrays.asList(15.0, 5.0));
		
		System.out.println(t1.converterParaFahrenheit());
		System.out.println(t2.converterParaFahrenheit());
		System.out.println(t3.converterParaFahrenheit());
		System.out.println(t4.converterParaFahrenheit());

	}

}
