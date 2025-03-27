package exercicios_poo_h_2;

public class Presencial extends Curso{
	private TipoDoCurso tipoDoCurso = TipoDoCurso.PRESENCIAL;
	
	public Presencial() {
		super();
	}

	public Presencial(String nome, Integer duracao) {
		super(nome, duracao);
		
	}

	public TipoDoCurso getTipoDoCurso() {
		return tipoDoCurso;
	}

	
}
