package study;

public class Contador {
	
	private int contador = 0;
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public void incrementar() {
		this.contador++;
	}
	public void decrementar() {
		this.contador--;
	}
	
}
/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Contador;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Contador contador = new Contador();
		contador.setContador(3);
		
		System.out.println(contador.getContador());
		contador.incrementar();
		
		System.out.println(contador.getContador());
		
		contador.decrementar();
		contador.decrementar();
		contador.decrementar();
		
		System.out.println(contador.getContador());
		sc.close();
	}

}*/