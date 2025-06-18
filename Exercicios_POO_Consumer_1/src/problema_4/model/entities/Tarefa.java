package problema_4.model.entities;

public class Tarefa {
	private String descricao;
	private Boolean concluida;
	
	public Tarefa(String descricao, Boolean concluida) {
		super();
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getConcluida() {
		return concluida;
	}

	public void setConcluida(Boolean concluida) {
		this.concluida = concluida;
	}
	
	
	
	
}
