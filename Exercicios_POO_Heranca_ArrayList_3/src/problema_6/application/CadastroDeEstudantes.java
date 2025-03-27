package problema_6.application;

import java.util.ArrayList;
import java.util.List;

import problema_6.entities.Estudante;
import problema_6.entities.EstudanteUniversitario;

public class CadastroDeEstudantes {
	List<Estudante> estudantes = new ArrayList<>();
	
	public void adicionarEstudantes(Estudante estudante) {
		estudantes.add(estudante);
	}
	
	public Integer calcularTotalDeUniversitarios() {
		
		Integer totalDeUniversitarios = 0;
		
		for(Estudante estudante : estudantes) {
			if(estudante instanceof EstudanteUniversitario) {
				totalDeUniversitarios++;
			}
		}
		
		return totalDeUniversitarios;
	}
}
