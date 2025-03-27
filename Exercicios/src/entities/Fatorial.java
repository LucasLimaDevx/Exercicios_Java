package entities;

public class Fatorial {
	public int numero;
	public int numeroComparativo;
	
	public int calcularFatorial() {
		int fatorial = 1;
		
		while(numero != 1) {
			fatorial *= numero;
			numero--;
		}
		
		return fatorial;
	}
	
	public String compararFatorial() {
		
		if(calcularFatorial() > numeroComparativo) {
			return "O fatorial é maior que o número comparativo.";
		}else if(calcularFatorial() == numeroComparativo) {
			return "O fatorial é igual ao número comparativo.";
		}
		return "O fatorial é menor que o número comparativo.";
		
	}
}
/*package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Fatorial;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Fatorial fatorial = new Fatorial();
		System.out.print("Digite um número: ");
		fatorial.numero = sc.nextInt();
		
		System.out.print("Digite o número comparativo: ");
		fatorial.numero = sc.nextInt();
		
		System.out.println("Fatorial: " + fatorial.numero);
		System.out.println(fatorial.compararFatorial());
		
		sc.close();
	}

}
*/