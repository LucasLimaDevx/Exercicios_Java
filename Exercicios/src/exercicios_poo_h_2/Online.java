package exercicios_poo_h_2;

public class Online extends Curso{
	private TipoDoCurso tipoDoCurso = TipoDoCurso.PRESENCIAL;
	
	public Online() {
		super();
	}

	public Online(String nome, Integer duracao) {
		super(nome, duracao);
		
	}

	public TipoDoCurso getTipoDoCurso() {
		return tipoDoCurso;
	}
	
	
}
