package exercicios_poo_h_2;

public class Pedido {
	private Integer codigo;
	private Double valor;
	private TipoDoPedido tipoDoPedido;
	
	public Pedido() {
		
	}

	public Pedido(Integer codigo, Double valor, TipoDoPedido tipoDoPedido) {
		
		this.codigo = codigo;
		this.valor = valor;
		this.tipoDoPedido = tipoDoPedido;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoDoPedido getTipoDoPedido() {
		return tipoDoPedido;
	}

	public void setTipoDoPedido(TipoDoPedido tipoDoPedido) {
		this.tipoDoPedido = tipoDoPedido;
	}
	
	
	
	
}
