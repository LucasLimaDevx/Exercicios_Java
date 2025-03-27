package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class RegistroDePessoas {
	List<Pessoa> pessoas = new ArrayList<>();
	
	public void adicionarPessoa(String pessoa, TipoDePessoa tipoDePessoa) {
		
		if(tipoDePessoa == TipoDePessoa.ALUNO) {
			pessoas.add(new Aluno(pessoa, tipoDePessoa));
		}else {
			pessoas.add(new Professor(pessoa, tipoDePessoa));
		}
	}
	
	public void listarPessoas() {
		for(Pessoa p : pessoas) {
			System.out.println(p.toString());
		}
	}
}
