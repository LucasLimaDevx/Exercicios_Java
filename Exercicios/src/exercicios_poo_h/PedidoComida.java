package exercicios_poo_h;

public class PedidoComida extends Pedido{
	public PedidoComida() {
		super();
	}

	public PedidoComida(TipoDePedido tipoDePedido, String nome, Integer quantidade) {
		super(tipoDePedido, nome, quantidade);
	}
	
	public Double calcularTotal() {
		return getQuantidade() * 40.0;
	}

	@Override
	public String toString() {
		return "Total a pagar: " + String.format("%.2f", calcularTotal());
	}
	
}
