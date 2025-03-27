package exercicios_poo_h;

public class PedidoBebida extends Pedido{
	public PedidoBebida() {
		super();
	}

	public PedidoBebida(TipoDePedido tipoDePedido, String nome, Integer quantidade) {
		super(tipoDePedido, nome, quantidade);
	}
	
	public Double calcularTotal() {
		return getQuantidade() * 5.0;
	}

	@Override
	public String toString() {
		return "Total a pagar: " + String.format("%.2f", calcularTotal());
	}
	
	
}
