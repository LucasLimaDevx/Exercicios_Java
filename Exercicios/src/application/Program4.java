package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d01 = LocalDate.parse("2003-04-23");
		LocalDateTime d02 = LocalDateTime.parse("2003-04-23T01:30:50");
		Instant d03 = Instant.parse("2003-04-23T01:30:50Z");
		
		LocalDate pastWeekDate = d01.minusDays(7);  
		LocalDate nextWeekDate = d01.plusDays(7); 
		
		System.out.println("pastWeekDate = " + pastWeekDate);// 2003-04-16
		System.out.println("nextWeekDate" + nextWeekDate); // 2003-04-30
		
		System.out.println("--------------------------------------------------------------------------");
		
		
		LocalDateTime pastWeekLocalDate = d02.minusDays(7);
		LocalDateTime nextWeekLocalDate = d02.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate); // 2003-04-16T01:30:50
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate); // 2003-04-30T01:30:50
		
		
		System.out.println("--------------------------------------------------------------------------");
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant); // 2003-04-16T01:30:50Z
		System.out.println("nextWeekInstant" + nextWeekInstant); // 2003-04-30T01:30:50Z
		
		
		System.out.println("--------------------------------------------------------------------------");
		
		Duration t1 = Duration.between(pastWeekDate.atTime(0, 0), d01.atTime(0, 0));
		Duration t2 = Duration.between(pastWeekLocalDate, d02);
		Duration t3 = Duration.between(pastWeekInstant, d03);
		Duration t4 = Duration.between(d03, pastWeekInstant);
		
		System.out.println("Dias t1 = " + t1.toDays());
		System.out.println("Dias t2 = " + t2.toDays());
		System.out.println("Dias t3 = " + t3.toDays());
		System.out.println("Dias t4 = " + t4.toDays());
	}

}
