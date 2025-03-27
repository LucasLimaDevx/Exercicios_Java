package problema_6.entities;

public class EstudanteUniversitario extends Estudante{
	private String curso;
	
	public EstudanteUniversitario() {
		super();
	}

	public EstudanteUniversitario(String nome, Integer idade, String curso) {
		super(nome, idade);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
