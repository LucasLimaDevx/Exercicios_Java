package problema_8.entities;

public class Guerreiro extends Personagem{
	public Guerreiro() {
		
	}
	
	public Guerreiro(String nome, Integer nivel, Integer vida, Integer mana, Integer forca, Integer inteligencia) {
		super(nome, nivel, vida, mana, forca, inteligencia);
	}


	@Override
	public Integer calcularDano() {
		
		return nivel+forca+inteligencia;
	}
	
	
}
