package exercicios_poo_h;

public class Pedido {
	private TipoDePedido tipoDePedido;
	private String nome;
	private Integer quantidade;
	
	public Pedido() {
		
	}

	public Pedido(TipoDePedido tipoDePedido, String nome, Integer quantidade) {
		
		this.tipoDePedido = tipoDePedido;
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public TipoDePedido getTipoDePedido() {
		return tipoDePedido;
	}

	public void setTipoDePedido(TipoDePedido tipoDePedido) {
		this.tipoDePedido = tipoDePedido;
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

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
