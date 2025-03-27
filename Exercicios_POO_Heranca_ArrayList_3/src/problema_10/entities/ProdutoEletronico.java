package problema_10.entities;

public class ProdutoEletronico extends Produto{
	private Integer garantia;
	
	public ProdutoEletronico() {
		super();
	}

	public ProdutoEletronico(String nome, Double valor, Integer garantia) {
		super(nome, valor);
		this.garantia = garantia;
	}

	public Integer getGarantia() {
		return garantia;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}
	
	
}
