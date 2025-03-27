package exercicios_poo;

public class ItemEstoque {
	private Integer codigo;
	private String descricao;
	private Integer estoque;
	
	public ItemEstoque(Integer codigo, String descricao) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.estoque = 0;
	}
	
	public ItemEstoque(Integer codigo, String descricao, Integer estoque) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.estoque = estoque;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void adicionarItem(Integer estoque) {
		this.estoque += estoque;
	}
	public void removerItem(Integer estoque) {
		this.estoque -= estoque;
	}
	
	
	
	
}
