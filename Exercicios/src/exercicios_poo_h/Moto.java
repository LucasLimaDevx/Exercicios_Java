package exercicios_poo_h;

public class Moto extends Veiculo{
	private TipoDoVeiculo tipo;
	
	public Moto() {
		super();
	}

	public Moto(String modelo, TipoDoVeiculo tipo) {
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
		return "Moto: \""+getModelo()+"\" adicionado à loja";
	}
	
	
	
}
