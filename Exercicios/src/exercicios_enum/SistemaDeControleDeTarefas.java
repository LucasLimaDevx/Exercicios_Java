package exercicios_enum;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeControleDeTarefas {

	List<Tarefa> tarefas = new ArrayList<>();
	
	public void adicionarTarefas(String descricao, Prioridade prioridade, Status_4 status) {
		Tarefa tarefa = new Tarefa(descricao, prioridade, status);
		
		tarefas.add(tarefa);
	}
	
	public void alterarStatus(String descricao, Status_4 status) {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao() == descricao) {
				tarefa.setStatus(status);
			}
		}
	}
	
	public void listarTarefas(Prioridade prioridade) {
		System.out.println("LISTAR TAREFAS COM PRIORIDADE: " + prioridade);
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getPrioridade() == prioridade) {
				System.out.println("TAREFA: " + tarefa.getDescricao() + " - Status: " + tarefa.getStatus());
			}
		}
	}
}
