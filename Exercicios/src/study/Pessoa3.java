package study;

public class Pessoa3 {
	private String nome;
	private int idade;
	private Endereco endereco;
	
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
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}


/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Pessoa3;




public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pessoa3 pessoa = new Pessoa3();
		pessoa.setNome("Mateus");
		pessoa.setIdade(10);
		
		System.out.println("Seu nome é " + pessoa.getNome() + " e você tem " + pessoa.getIdade() + " anos.");
		
		pessoa.fazerAniversario();
		
		System.out.println("Seu nome é " + pessoa.getNome() + " e você tem " + pessoa.getIdade() + " anos.");
		sc.close();
	}
*/