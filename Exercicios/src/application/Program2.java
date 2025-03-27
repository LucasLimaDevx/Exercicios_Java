package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		LocalDate d01 = LocalDate.parse("2003-04-24");
		
		System.out.println(d01); // 2003-04-24
		System.out.println(d01.format(fmt1)); // 24/04/2003
		System.out.println(fmt1.format(d01)); // 24/04/2003
		
		System.out.println("-----------------------------");
		
		LocalDateTime d02 = LocalDateTime.parse("2003-04-24T22:30:22");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		
		System.out.println(d02); // 2003-04-24T22:30:22
		System.out.println(d02.format(fmt2)); // 24/04/2003 22:30
		
		
		System.out.println("-----------------------------");
		
		Instant d03 = Instant.parse("2003-04-24T22:30:22Z");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println(d03); // 2003-04-24T22:30:22Z
		System.out.println(fmt3.format(d03)); // 24/04/2003 19:30
		
		System.out.println("-----------------------------");
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		System.out.println(fmt4);
		System.out.println(d01); // 2003-04-24
		System.out.println(d01.format(fmt4)); // 2003-04-24
		System.out.println(d03);// 2003-04-24T22:30:22Z
		System.out.println(fmt5.format(d03));// 2003-04-24T22:30:22Z
	}

}
