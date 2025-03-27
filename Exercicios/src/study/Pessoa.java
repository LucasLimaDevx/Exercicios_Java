package study;


public class Pessoa {
	public String nome;
	public int idade;
	
	
	
	public Pessoa(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	
	}



	public String toString() {
		return "Olá, meu nome é " + nome
				+ " e tenho " + idade
				+ " anos.";
	}
}
/*
 * package application;


import java.util.Locale;
import java.util.Scanner;

import study.Pessoa;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa("Ana" , 30);
		Pessoa pessoa2 = new Pessoa("Lucas" , 24);
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		
		sc.close();
	}

}
 */