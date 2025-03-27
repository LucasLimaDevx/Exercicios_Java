package problema_8.entities;

public class Mago extends Personagem{
	public Mago() {
		super();
	}

	public Mago(String nome, Integer nivel, Integer vida, Integer mana, Integer forca, Integer inteligencia) {
		super(nome, nivel, vida, mana, forca, inteligencia);
	}

	@Override
	public Integer calcularDano() {
		// TODO Auto-generated method stub
		return 2 * (forca+inteligencia);
	}
	
	
}
