package entities;

public class ConversorDeMoedas {
	public double valorEmReais;
	public double taxaDeCambio;
	
	public double valorConvertido() {
		return valorEmReais * taxaDeCambio;
	}
}
