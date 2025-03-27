package problema_5.application;

import java.util.Locale;
import java.util.Scanner;

import problema_5.entities.Metro;
import problema_5.entities.Onibus;
import problema_5.entities.Transporte;
import problema_5.entities.Trem;
import problema_5.enums.TipoDeTransporte;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tipo de transporte: ");
		String tipo = sc.next().toUpperCase();
		
		System.out.print("Digite a distância: ");
		Double distancia = sc.nextDouble();
		
		Transporte transporte;
		
		switch(tipo) {
			case "ONIBUS":
				transporte = new Onibus(distancia, TipoDeTransporte.valueOf(tipo));
				break;
			case "TREM":
				transporte = new Trem(distancia, TipoDeTransporte.valueOf(tipo));
				break;
			default:
				transporte = new Metro(distancia, TipoDeTransporte.valueOf(tipo));
				
		}
		
		Double valorDaPassagem = transporte.calcularPassagem();
		
		System.out.println("Valor da passagem: " + String.format("%.2f", valorDaPassagem));
		
		
		sc.close();
	}

}
