package problema_6.entities;

public abstract class Instrumento {
	private String nome;
	private String material;
	private Double tamanho;
	
	public Instrumento() {		
	}

	public Instrumento(String nome, String material, Double tamanho) {
		
		this.nome = nome;
		this.material = material;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
	
	public abstract String tocar();
	
	
}
