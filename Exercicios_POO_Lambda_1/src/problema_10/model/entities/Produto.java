package problema_10.model.entities;

public class Produto {
	private String nome;
	private Double preco;
	
	
	public Produto(String nome, Double preco) {
		
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void aplicarDesconto() {
		if(preco <= 100.0) {
			preco = preco * (1 - 0.05);
		}
		else if(preco >= 501.0 && preco < 500.0) {
			preco = preco * (1 - 0.1);
		}
		else {
			System.out.println(nome);
			preco = preco * (1 - 0.15);
		}
	}
	
	
}
