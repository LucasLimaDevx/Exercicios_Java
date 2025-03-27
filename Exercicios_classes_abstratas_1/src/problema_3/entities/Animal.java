package problema_3.entities;

public abstract class Animal {
	private String nome;
	private Integer idade;
	private String raca;
	
	public Animal() {
		
	}

	public Animal(String nome, Integer idade, String raca) {
		
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
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

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public abstract String emitirSom();
	
	
}
