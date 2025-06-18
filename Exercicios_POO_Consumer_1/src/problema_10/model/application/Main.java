package problema_10.model.application;

import java.util.List;

import problema_9.model.entities.Reserva;

public class Main {

	public static void main(String[] args) {
		List<Reserva> reservas = List.of(
			new Reserva(101, false),
			new Reserva(102, false),
			new Reserva(103, false),
			new Reserva(104, false)
		);
		
		
		reservas.forEach(r -> r.setConfirmado(true));
		
		reservas.forEach(r -> System.out.println(r.getConfirmado()));
	}

}
