package exercicios_poo_h;

public class Carro extends Veiculo{
	private TipoDoVeiculo tipo;
	
	public Carro() {
		
	}

	public Carro(String modelo, TipoDoVeiculo tipo) {
		super(modelo);
		this.tipo = tipo;
	}

	public TipoDoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoDoVeiculo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Carro: \""+getModelo()+"\" adicionado à loja";
	}

	
	
	
}
