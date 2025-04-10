package problema_6.model.application;

import java.util.Locale;
import java.util.Scanner;

import problema_6.model.exception.NotaReprovadaException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor da nota: ");
		Double nota = input.nextDouble();
		
		try {
			verificarNota(nota);
		}
		catch(NotaReprovadaException e) {
			System.out.println(e.getMessage());
		}
		
		input.close();
	}
	
	public static void verificarNota(Double nota) throws NotaReprovadaException {
		if(nota < 6) {
			throw new NotaReprovadaException("Nota insuficiente. Reprovado");
		}
		
		System.out.println("Aprovado");
	}
}
