package entities;

public class Notas{
	private String nome;
	private double nota1;
	private double nota2;
	
	public Notas(String nome, double nota1, double nota2) {
		
		setNome(nome);
		setNota1(nota1);
		setNota2(nota2);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	
}

