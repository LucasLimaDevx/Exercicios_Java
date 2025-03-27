package exercicios_enum;

public class Tarefa {
	private String descricao;
	private Prioridade prioridade;
	private Status_4 status;
	
	public Tarefa(String descricao, Prioridade prioridade, Status_4 status) {
		
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.status = status;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Status_4 getStatus() {
		return status;
	}

	public void setStatus(Status_4 status) {
		this.status = status;
	}
	
	
	
	
	
}
