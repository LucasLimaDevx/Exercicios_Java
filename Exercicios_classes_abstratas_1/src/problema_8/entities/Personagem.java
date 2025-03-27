package problema_8.entities;

public abstract class Personagem {
	private String nome;
	protected Integer nivel;
	protected Integer vida;
	protected Integer mana;
	protected Integer forca;
	protected Integer inteligencia;
	
	public Personagem() {
		
	}
		
	public Personagem(String nome, Integer nivel, Integer vida, Integer mana, Integer forca, Integer inteligencia) {
		this.nome = nome;
		this.nivel = nivel;
		this.vida = vida;
		this.mana = mana;
		this.forca = forca;
		this.inteligencia = inteligencia;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public Integer getForca() {
		return forca;
	}

	public void setForca(Integer forca) {
		this.forca = forca;
	}

	public Integer getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}

	public abstract Integer calcularDano();
	
}
