package exercicios_poo_h;

public class Aluno extends Pessoa{
	public Aluno() {
		super();
	}

	public Aluno(String nome, TipoDePessoa tipoDePessoa) {
		super(nome, tipoDePessoa);
	}

	@Override
	public String toString() {
		return "Aluno \""+ getNome() + "\" registrado";
	}
	
	
	
}
