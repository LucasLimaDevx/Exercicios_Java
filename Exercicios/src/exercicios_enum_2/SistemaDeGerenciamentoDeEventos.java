package exercicios_enum_2;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeGerenciamentoDeEventos {
	List<Evento> eventos = new ArrayList<Evento>();
	
	public void adicionarEvento(String nome, String local, Tipo tipo) {
		Evento evento = new Evento(nome, local, tipo);
		
		eventos.add(evento);
	}
	
	public void buscarEvento(Tipo tipo) {
		for(Evento evento : eventos) {
			if(evento.getTipo() == tipo) {
				System.out.println("Nome: " + evento.getNome());
				System.out.println("Local: " + evento.getLocal());
				System.out.println("---------------------");
			}
			
		}
	}
	
	public void listarEventos(String local) {
		System.out.println("LISTANDO EVENTOS");
		for(Evento evento : eventos) {
			if(evento.getLocal().equals(local)) {
				System.out.println("Nome: " + evento.getNome());
				System.out.println("Tipo: " + evento.getTipo());
				System.out.println("---------------------");
			}
			
		}
	}
 }
