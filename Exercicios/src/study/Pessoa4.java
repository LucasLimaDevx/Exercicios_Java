package study;

public class Pessoa4 {
	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade >= 0) {
			this.idade = idade;
		}
		System.out.println("Digite um idade válida");
	}
	
	public void fazerAniversario() {
		this.idade++;
	}
}/*package application;

import java.util.Locale;
import java.util.Scanner;

import study.Pessoa4;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pessoa4 pessoa = new Pessoa4();
		
		pessoa.setNome("Mateus");
		pessoa.setIdade(-23);
		
		System.out.println(pessoa.getIdade());
		pessoa.setIdade(23);
		
		System.out.println(pessoa.getIdade());
		
		sc.close();
	}

}*/
