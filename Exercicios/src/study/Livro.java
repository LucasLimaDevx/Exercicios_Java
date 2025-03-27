package study;

public class Livro {
	
	private String titulo;
	private String autor;
	private int ano;
	
	public Livro(String titulo, String autor, int ano) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "Tirtulo: " + getTitulo()
				+ ", Autor: " + getAutor()
				+ ", Ano: " + getAno();
	}
	
	
}
/*package application;


import java.util.Locale;
import java.util.Scanner;

import study.Livro;




public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Livro livro = new Livro("1984", "George Orwell", 1949);
		
		System.out.println(livro);
		
		livro.setTitulo("A revolução dos bichos");
		
		System.out.println(livro.getTitulo());
		
		System.out.println(livro);
		
		sc.close();
	}

}*/
