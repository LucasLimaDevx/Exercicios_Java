package study;

public class Pessoa5 {
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
		if(idade >= 0) {
			this.idade = idade;
		}
		System.out.println("Digite um idade válida");
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

import study.Endereco;
import study.Pessoa5;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pessoa5 pessoa = new Pessoa5();
		
		pessoa.setNome("Mateus");
		pessoa.setIdade(23);
		
		Endereco endereco = new Endereco("Rua A", "São Luís");
		
		pessoa.setEndereco(endereco);
		String rua = pessoa.getEndereco().rua;
		String cidade = pessoa.getEndereco().cidade;
		
		System.out.println("Endereço: " + rua + ", " + cidade);
		
		sc.close();
	}

}*/