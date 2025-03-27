package exercicios_poo_h;

public class Pessoa {
	private String nome;
	private TipoDePessoa tipoDePessoa;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, TipoDePessoa tipoDePessoa) {
		
		this.nome = nome;
		this.tipoDePessoa = tipoDePessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoDePessoa getTipoDePessoa() {
		return tipoDePessoa;
	}

	public void setTipoDePessoa(TipoDePessoa tipoDePessoa) {
		this.tipoDePessoa = tipoDePessoa;
	}
	
	
	
	
}
