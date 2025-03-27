package problema_10.entities;

public class Alimento extends Produto{

	public Alimento() {
		super();
	}

	public Alimento(String nome, String categoria, Double precoBase, Integer codigoDeBarras) {
		super(nome, categoria, precoBase, codigoDeBarras);
	}

	@Override
	public Double calcularPrecoFinal() {
		// TODO Auto-generated method stub
		return getPrecoBase() * (1 + 5.0 / 100.0 );
	}

	
}
