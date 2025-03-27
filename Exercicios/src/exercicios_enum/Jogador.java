package exercicios_enum;

public class Jogador {
	private String nome;
	private Posicao posicao;
	private String time;
	
	public Jogador(String nome, Posicao posicao, String time) {
	
		this.nome = nome;
		this.posicao = posicao;
		this.time = time;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
