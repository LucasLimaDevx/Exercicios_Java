package problema_8.application;

import java.util.ArrayList;
import java.util.List;

import problema_8.entities.Computador;
import problema_8.entities.Equipamento;

public class ControleDeEquipamentos {
	List<Equipamento> equipamentos = new ArrayList<>();
	
	public void adicionarEquipamento(String nome, String numeroDeSerie) {
		Equipamento equipamento = new Equipamento(nome, numeroDeSerie);
		equipamentos.add(equipamento);
		
	}
	
	public void adicionarEquipamento(String nome, String numeroDeSerie, String processador) {
		Equipamento computador = new Computador(nome, numeroDeSerie, processador);
		equipamentos.add(computador);
		
	}
	/*
	public void adicionarEquipamento(String nome, String numeroDeSerie, String processador) {
		if(processador != null) {
			Equipamento computador = new Computador(nome, numeroDeSerie, processador);
			equipamentos.add(computador);
		}else {
			Equipamento equipamento = new Equipamento(nome, numeroDeSerie);
			equipamentos.add(equipamento);
		}
		
	}*/
	
	public String listarEquipamentos() {
		StringBuilder sb = new StringBuilder();
		for(Equipamento e : equipamentos) {
			if(e instanceof Computador) {
				Computador computador = (Computador) e;
				
				sb.append(computador.getNome() + " - " + computador.getNumeroDeSerie()+", " + computador.getProcessador() + " ");
			}else {
				sb.append(e.getNome() + " - " + e.getNumeroDeSerie()+" ");
			}
		}
		
		return sb.toString();
	}
}
