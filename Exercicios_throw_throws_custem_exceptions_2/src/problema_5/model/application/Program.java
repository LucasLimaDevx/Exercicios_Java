package problema_5.model.application;

import java.util.Scanner;

import problema_5.model.exception.PlacaInvalidaException;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o códgio da placa: ");
		String codigoDaPlaca = input.next();
		
		try {
			verificaFormatoDaPlaca(codigoDaPlaca);
		}
		catch(PlacaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		input.close();
	}
	
	public static void verificaFormatoDaPlaca(String codigoDaPlaca) throws PlacaInvalidaException {
		
		
		for(int i = 0 ; i < codigoDaPlaca.length() ; i++) {
			int codeASCII = (int) codigoDaPlaca.toUpperCase().charAt(i);
		
			
			System.out.println();
			if((i >= 0 && i <= 2 ) && codeASCII > 64 && codeASCII < 91) {
				continue;
			}
			else if(i == 3 && codeASCII == 45) {
				continue;
			}
			else if((i >= 4 && i <= 7 ) && codeASCII > 47 && codeASCII < 58) {
				continue;
			}
			else {
				throw new PlacaInvalidaException("Placa inválida: o formato deve ser XXX-9999");
			}
			
		}
		
		System.out.println("Veículo cadastrado com sucesso");
	}

}
