package problema_3.model.application;

import problema_3.model.entities.RoboLimpeza;
import problema_3.model.entities.RoboSeguranca;
import problema_3.model.interfaces.Robo;

public class Program {

	public static void main(String[] args) {
		Robo r1 = new RoboLimpeza();
		Robo r2 = new RoboSeguranca();
		
		System.out.println(r1.mover());
		System.out.println(r1.executarTarefa());
		
		System.out.println(r2.mover());
		System.out.println(r2.executarTarefa());
		
		Robo r3 = new RoboLimpeza();
		Robo r4 = new RoboSeguranca();
		
	
		System.out.println(r3.executarTarefa());

		System.out.println(r4.executarTarefa());
	}

}
