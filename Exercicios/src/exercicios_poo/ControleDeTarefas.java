package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class ControleDeTarefas {
	private List<Tarefa> tarefas = new ArrayList<>();
	
	public void adicionarTarefa(String descricao, Boolean status) {
		Tarefa tarefa = new Tarefa(descricao, status);
		
		tarefas.add(tarefa);
	}
	
	public void listarTarefasPendentes() {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getStatus() == false) {
				System.out.println(tarefa.getDescricao());
			}
		}
	}
}
