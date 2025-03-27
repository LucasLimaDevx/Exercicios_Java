package exercicios_enum_2;

import java.util.ArrayList;
import java.util.List;

public class SistemadeGestaodeConsultasMedicas {
	List<Consulta> consultas = new ArrayList<Consulta>();
	
	public void adicionarConsulta(Integer id, String paciente, String medico, Status status) {
		Consulta consulta = new Consulta(id, paciente, medico, status);
		
		consultas.add(consulta);
	}
	
	public void alterarStatus(Integer id, Status status) {
		
		for(Consulta consulta : consultas) {
			if(consulta.getId().equals(id)) {
				consulta.setStatus(status);
			}
		}
	}
	
	public String listarPorStatus(Status status) {
		StringBuilder sb = new StringBuilder();
		
		for(Consulta consulta : consultas) {
			if(consulta.getStatus() == status) {
				sb.append(consulta.getPaciente() + " - " + consulta.getMedico() + " - " + consulta.getStatus() + "\n");
			}
		}
		
		return sb.toString();
	}
	
	
}
