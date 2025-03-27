package exercicios_poo_h;

public class Produto {
	private String nome;
	private TipoDoProduto tipoDoProduto;
	
	public Produto() {
		
	}

	public Produto(String nome, TipoDoProduto tipoDoProduto) {
		
		this.nome = nome;
		this.tipoDoProduto = tipoDoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoDoProduto getTipoDoProduto() {
		return tipoDoProduto;
	}

	public void setTipoDoProduto(TipoDoProduto tipoDoProduto) {
		this.tipoDoProduto = tipoDoProduto;
	}
	
	
	
	
}
