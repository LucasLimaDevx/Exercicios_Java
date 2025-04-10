package entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
	
		setNome(nome);
		setIdade(idade);
		setAltura(altura);
		
	}

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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "Nome: "+getNome() + "\nIdade: "+getIdade()+"\nAltura: "+getAltura();
	}
	public boolean verificaIdade() {
		return getIdade() >= 18;
	}
	
	
	
	
	
	
	

}
