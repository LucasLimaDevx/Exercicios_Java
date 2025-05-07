package problema_9.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Turma {
	private List<String> alunos = new ArrayList<>();
	
	public void adicionarAluno(String aluno) {
		alunos.add(aluno);
	}

	public List<String> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<String> alunos) {
		this.alunos = alunos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alunos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		return Objects.equals(alunos, other.alunos);
	}
	
	
	
	
}
