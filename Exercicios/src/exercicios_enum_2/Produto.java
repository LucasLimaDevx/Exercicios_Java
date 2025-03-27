package exercicios_enum_2;

public class Produto {
	private String nome;
	private Integer quantidade;
	private Categoria categoria;

	
	Produto(){
		
	}


	public Produto(String nome, Integer quantidade, Categoria categoria) {
	
		this.nome = nome;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getQuantidade() {
		return quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
}
