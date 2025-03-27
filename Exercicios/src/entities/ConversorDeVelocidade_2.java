package entities;

public class ConversorDeVelocidade_2 {
	public double velocidadeKmH;
	public double limiteDeVelocidade;
	
	public double converterParaMetrosPorSegundos() {
		return velocidadeKmH / 3.6;
	}
	
	public String verificarLimiteDaVelocidade() {
		if(converterParaMetrosPorSegundos() > limiteDeVelocidade) {
			return "A velocidade está acima do limite.";
		}
		else if(converterParaMetrosPorSegundos() == limiteDeVelocidade) {
			return "A velocidade está no limite.";
		}
		
		return "A velocidade está abaixo do limite.";
	}
}
