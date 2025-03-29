package problema_9.model.application;

import problema_9.model.entities.Guitarra;
import problema_9.model.entities.Piano;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitarra g = new Guitarra();
		Piano p = new Piano();
		
		g.tocar();
		g.parar();
		
		p.tocar();
		p.parar();
	}

}
