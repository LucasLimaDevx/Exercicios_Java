package problema_9.application;

import java.util.ArrayList;
import java.util.List;

import problema_9.entities.Paciente;
import problema_9.entities.PacienteInternado;

public class GestaoDePacientes {
	List<Paciente> pacientes = new ArrayList<>();
	
	public void adicionarPaciente(String nome, Integer idade) {
		Paciente paciente = new Paciente(nome, idade);
		pacientes.add(paciente);
	}
	
	public void adicionarPaciente(String nome, Integer idade, String quarto) {
		Paciente paciente = new PacienteInternado(nome, idade, quarto);
		pacientes.add(paciente);
	}
	
	public Integer calcularQuantidadesPacientesInternados() {
		Integer totalPacientesInternados = 0;
		
		for(int i = 0 ; i < pacientes.size() ; i++) {
			if(pacientes.get(i) instanceof PacienteInternado) {
				totalPacientesInternados++;
			}
		}
		
		return totalPacientesInternados;
	}
}
