package exercicios_poo_h;

public class Professor extends Pessoa{
	public Professor() {
		
	}

	public Professor(String nome, TipoDePessoa tipoDePessoa) {
		super(nome, tipoDePessoa);
	}
	
	@Override
	public String toString() {
		return "Professor \""+ getNome() + "\" registrado";
	}
}
