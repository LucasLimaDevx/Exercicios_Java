package problema_3.model.entities;

import problema_3.model.enums.Cor;

public class Carro {
	private String nome;
	private Integer ano;
	private Cor cor;
	
	
	public Carro(String nome, Integer ano, Cor cor) {
	
		this.nome = nome;
		this.ano = ano;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
	
	
}
