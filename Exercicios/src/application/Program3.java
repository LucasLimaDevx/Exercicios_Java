package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2003-04-23");
		LocalDateTime d02 = LocalDateTime.parse("2003-04-23T01:30:50");
		Instant d03 = Instant.parse("2003-04-23T01:30:50Z");
		
		LocalDate d11 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate d12 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime d22 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime d23 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println(d11); // 2003-04-22
		System.out.println(d12); // 2003-04-23
		System.out.println(d22); // 2003-04-22T22:30:50
		System.out.println(d23); // 2003-04-23T02:30:50
		System.out.println("---------------");
		System.out.println("d01 dia = " + d01.getDayOfMonth()); // d01 dia = 23
		System.out.println("d01 mês = " + d01.getMonthValue()); // d01 mês = 4
		System.out.println("d01 anos = " + d01.getYear()); // d01 ano = 2003
		System.out.println("---------------");
		System.out.println("d02 hora = " + d02.getHour()); // 1
		System.out.println("d02 minutos = " + d02.getMinute()); // 30
		System.out.println("d02 segundos = " + d02.getSecond()); // 50
		System.out.println("d02 milisegundos = " + d02.getNano()); // 0
	}

}
