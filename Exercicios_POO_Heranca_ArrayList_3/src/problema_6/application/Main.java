package problema_6.application;

import problema_6.entities.Estudante;
import problema_6.entities.EstudanteUniversitario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante e1 = new Estudante("João", 16);
		Estudante e2 = new EstudanteUniversitario("Ana", 18, "Engenharia Civil");
		Estudante e3 = new EstudanteUniversitario("Carlos", 22, "Medicina");
		
		Estudante e4 = new Estudante("Maria", 14);
		Estudante e5 = new EstudanteUniversitario("Pedro", 18, "Administração");
		Estudante e6 = new Estudante("Júlia", 15);
		
		Estudante e7 = new EstudanteUniversitario("Tiago", 20, "Ciências Contabeis");
		Estudante e8 = new Estudante("Fernanda", 17);
		
		CadastroDeEstudantes sistema1 = new CadastroDeEstudantes();
		CadastroDeEstudantes sistema2 = new CadastroDeEstudantes();
		CadastroDeEstudantes sistema3 = new CadastroDeEstudantes();
		
		sistema1.adicionarEstudantes(e1);
		sistema1.adicionarEstudantes(e2);
		sistema1.adicionarEstudantes(e3);
		
		sistema2.adicionarEstudantes(e4);
		sistema2.adicionarEstudantes(e5);
		sistema2.adicionarEstudantes(e6);
		
		sistema3.adicionarEstudantes(e7);
		sistema3.adicionarEstudantes(e8);
		
		System.out.println("Universitários: "+sistema1.calcularTotalDeUniversitarios());
		System.out.println("Universitários: "+sistema2.calcularTotalDeUniversitarios());
		System.out.println("Universitários: "+sistema3.calcularTotalDeUniversitarios());
		
	}

}
