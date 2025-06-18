package problema_4.model.application;

import java.util.List;

import problema_4.model.entities.Tarefa;

public class Main {

	public static void main(String[] args) {
		List<Tarefa> tarefas = List.of(
			new Tarefa("Estudar Java", false),
			new Tarefa("Lavar roupa", false),
			new Tarefa("Comprar pão", false),
			new Tarefa("Revisar aula", false)
			
		);
		
		
		tarefas.forEach(t -> t.setConcluida(true));
		
		tarefas.forEach( t -> System.out.println(t.getConcluida() ? t.getDescricao() + " concluída" : t.getDescricao() + " não concluída"));

	}

}
