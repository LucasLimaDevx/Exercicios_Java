package problema_10.entities;

public class Eletronico extends Produto{

	public Eletronico() {
		super();
	}

	public Eletronico(String nome, String categoria, Double precoBase, Integer codigoDeBarras) {
		super(nome, categoria, precoBase, codigoDeBarras);
	}

	@Override
	public Double calcularPrecoFinal() {
		// TODO Auto-generated method stub
		return getPrecoBase() * (1 + 15.0 / 100.0 );
	}
	
	
	
}
