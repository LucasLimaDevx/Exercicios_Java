package exercicios_poo_h_2;

public class Animal {
	private String nome;
	private Integer idade;
	
	public Animal() {
		
	}

	public Animal(String nome, Integer idade) {
		
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
}
