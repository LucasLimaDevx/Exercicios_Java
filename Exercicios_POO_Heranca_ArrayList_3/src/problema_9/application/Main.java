package problema_9.application;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GestaoDePacientes sistema1 = new GestaoDePacientes();
		GestaoDePacientes sistema2 = new GestaoDePacientes();
		GestaoDePacientes sistema3 = new GestaoDePacientes();
		
		sistema1.adicionarPaciente("João", 45);
		sistema1.adicionarPaciente("Ana", 60, "(Internada - Quarto 12)");
		sistema1.adicionarPaciente("Caros", 30);
		
		
		sistema2.adicionarPaciente("Maria", 25, "(Internada - Quarto 5)");
		sistema2.adicionarPaciente("Pedro", 40);
		
		sistema3.adicionarPaciente("Júlia", 50, "(Internada - Quarto 9)");
		sistema3.adicionarPaciente("Tiago", 55, "(Internada - Quarto 15)");
		
		System.out.println("Internados: " +sistema1.calcularQuantidadesPacientesInternados());
		System.out.println("Internados: " +sistema2.calcularQuantidadesPacientesInternados());
		System.out.println("Internados: " +sistema3.calcularQuantidadesPacientesInternados());
		
	}

}
