package problema_2.entities;

public class Carro extends Veiculo{
	public Integer numeroDePortas;
	
	public Carro() {
		super();
	}

	public Carro(String modelo, Integer ano, Integer numeroDePortas) {
		super(modelo, ano);
		this.numeroDePortas = numeroDePortas;
	}

	public Integer getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(Integer numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	
}
