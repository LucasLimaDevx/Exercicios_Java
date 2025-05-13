package problema_4.model.entities;

import java.util.Objects;

public class Funcionario {
	private String nome;
	private Integer faltas;
	private String cpf;
	
	
	public Funcionario(String nome, String cpf, Integer faltas) {
		this.nome = nome;
		this.cpf = cpf;
		this.faltas = faltas;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getFaltas() {
		return faltas;
	}


	public void setFaltas(Integer faltas) {
		this.faltas = faltas;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf, faltas, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(faltas, other.faltas)
				&& Objects.equals(nome, other.nome);
	}


	
	
	
}
