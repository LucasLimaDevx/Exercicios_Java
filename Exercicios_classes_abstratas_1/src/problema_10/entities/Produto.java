package problema_10.entities;

public abstract class Produto {
	private String nome;
	private String categoria;
	private Double precoBase;
	private Integer codigoDeBarras;
	
	public Produto() {
	}

	public Produto(String nome, String categoria, Double precoBase, Integer codigoDeBarras) {
		
		this.nome = nome;
		this.categoria = categoria;
		this.precoBase = precoBase;
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(Double precoBase) {
		this.precoBase = precoBase;
	}

	public Integer getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(Integer codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	
	public abstract Double calcularPrecoFinal();
	
	
	
	
}
