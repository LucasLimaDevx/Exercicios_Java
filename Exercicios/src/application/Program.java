package application;

import java.util.Locale;

import exercicios_poo_h_2.Aviao;
import exercicios_poo_h_2.Onibus;
import exercicios_poo_h_2.RegistroDeTransporte;
import exercicios_poo_h_2.Transporte;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Transporte t1 = new Aviao("São Paulo", "Rio de Janeiro", 500.0);
		Transporte t2 = new Onibus("São Luís", "Teresina", 80.0);
		Transporte t3 = new Aviao("Fortaleza", "Recife", 450.0);
		
		RegistroDeTransporte sistema = new RegistroDeTransporte();
		
		sistema.adicionarTransporte(t1);
		sistema.adicionarTransporte(t2);
		sistema.adicionarTransporte(t3);
		
		sistema.listarTransporte();
	}
	
}

