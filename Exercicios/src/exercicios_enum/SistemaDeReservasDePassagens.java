package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeReservasDePassagens {
	List<Passagem> passagens = new ArrayList<>();
	
	public void adicionarPassagem(Integer numero, String destino, Classe classe) {
		Passagem passagem = new Passagem(numero, destino, classe);
		
		passagens.add(passagem);
	}
	
	public void buscarPassagem(Classe classe) {
		System.out.println("LISTANDO PASSAGEM DA CLASSE: " + classe);
		
		for(Passagem passagem : passagens) {
			if(passagem.getClasse() == classe) {
				System.out.println("NUMERO: " + passagem.getNumero());
				System.out.println("DESTINO: " + passagem.getDestino());
			}
		}
	}
	
	public void listarTodasAsPassagens() {
		System.out.println("LISTANDO TODAS AS PASSAGENS");
		
		for(Passagem passagem : passagens) {
			System.out.println("NUMERO: " + passagem.getNumero());
			System.out.println("DESTINO: " + passagem.getDestino());
			System.out.println("CLASSE: " + passagem.getClasse());
			System.out.println("------------------------");
		}
	}
}
