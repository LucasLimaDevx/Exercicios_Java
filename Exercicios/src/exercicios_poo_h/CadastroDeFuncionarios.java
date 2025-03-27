package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeFuncionarios {
	List<Funcionario> list = new ArrayList<>();
	
	public void adicionar(String nome, Double salarioBase, Cargo cargo) {
		
		if(Cargo.DESENVOLVEDOR == cargo) {
			Desenvolvedor funcionario = new Desenvolvedor(nome, salarioBase, cargo);
			
			list.add(funcionario);
		}else {
			Gerente funcionario = new Gerente(nome, salarioBase, cargo);
			
			list.add(funcionario);
		}
	}
	
	public void listarFuncionario() {
		for(Funcionario f : list) {
			
			if(f.getCargo() == Cargo.DESENVOLVEDOR) {
				Desenvolvedor d = (Desenvolvedor) f;
				
				System.out.println(d.getNome() + " - " + String.format("%.2f", d.getSalarioBase()));
			}else {
				Gerente g = (Gerente) f;
				
				System.out.println(g.getNome() + " - " + String.format("%.2f", g.getSalarioBase()));
			}
			
		}
	}


}