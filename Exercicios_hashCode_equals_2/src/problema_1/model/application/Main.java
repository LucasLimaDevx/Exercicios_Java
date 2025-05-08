package problema_1.model.application;

import problema_1.model.entities.Empresa;
import problema_1.model.entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		empresa.adicionarFuncionario("João", "111", 3000.0);
		empresa.adicionarFuncionario("Maria", "222", 3000.0);
		empresa.adicionarFuncionario("Carlos", "333", 2500.0);
		empresa.adicionarFuncionario("Pedro", "555", 2000.0);
		
		 System.out.println(empresa.verificarFuncionario(new Funcionario("João", "111", 4000.0)));
		 System.out.println(empresa.verificarFuncionario(new Funcionario("Ana", "222", 3000.0)));
		 System.out.println(empresa.verificarFuncionario(new Funcionario("Carlos", "444", 2500.0)));
		 System.out.println(empresa.verificarFuncionario(new Funcionario("Pedro", "555", 2000.0)));
	}

}
