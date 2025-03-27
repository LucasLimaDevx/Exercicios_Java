package exercicios_poo;

public class Tarefa {
	public String descricao;
	public Boolean status;
	
	public Tarefa(String descricao, Boolean status) {
	
		this.descricao = descricao;
		this.status = status;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	
}
