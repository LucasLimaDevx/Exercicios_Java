package problema_7.entities;

public class PedidoDelivery extends Pedido{
	private Double taxa;
	
	public PedidoDelivery() {
		super();
	}

	public PedidoDelivery(Integer id, Double valor, Double taxa) {
		super(id, valor);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	@Override
	public Double getValor() {
		return super.getValor() + taxa;
	}
	
	
}
