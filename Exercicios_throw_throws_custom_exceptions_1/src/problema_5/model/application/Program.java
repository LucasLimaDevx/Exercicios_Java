package problema_5.model.application;

import java.util.Locale;
import java.util.Scanner;

import problema_5.model.exception.DivisaoPorZeroException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor do númerador: ");
		Double numerador = input.nextDouble();
		
		System.out.print("Digite o valor do denominador: ");
		Double denominador = input.nextDouble();
		
		try {
			Double resultado = divisao(numerador, denominador);
			System.out.println("Resultado da divisão é: " + String.format("%.2f", resultado));
		}
		catch(DivisaoPorZeroException e) {
			System.out.println(e.getMessage());
		}
		
		
		input.close();
	}
	
	public static double divisao(Double numerador, Double denominador) throws DivisaoPorZeroException {
		if(denominador == 0) {
			throw new DivisaoPorZeroException("Não é possível dividir por zero!");
		}
		
		return numerador / denominador;
	}

}
