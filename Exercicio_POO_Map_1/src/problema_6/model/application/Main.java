package problema_6.model.application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import problema_6.model.entities.Moeda;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Map<String, Moeda> moedas = new HashMap<String, Moeda>();
		
		Moeda m1 = new Moeda("Dolar", 0.2);
		Moeda m2 = new Moeda("Euro", 0.18);
		Moeda m3 = new Moeda("Libra", 0.15);
		Moeda m4 = new Moeda("Peso", 0.40);
		
		
		moedas.put(m1.getNome(), m1);
		moedas.put(m2.getNome(), m2);
		moedas.put(m3.getNome(), m3);
		moedas.put(m4.getNome(), m4);
		
		System.out.print("Digite um valor em R$: ");
		Double valor = sc.nextDouble();
		
		converterValor(moedas, valor);
		
		sc.close();
	}
	
	public static void converterValor(Map<String, Moeda> moedas, Double real) {
		for(String moeda : moedas.keySet()) {
			
			System.out.println(moeda +": " + String.format("%.2f",  moedas.get(moeda).getCotacao() * real));
		}
	}
}
