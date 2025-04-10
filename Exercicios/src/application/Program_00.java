package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program_00 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d)); // 25/06/2018 12:42:07
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); 
		d = cal.getTime(); 
		
	
		
		System.out.println(sdf.format(d)); // 25/06/2018 16:42:07

		int minutes = cal.get(Calendar.MINUTE);
		int month = cal.get(Calendar.MONTH);
		
		System.out.println("Minutes = " + minutes); // Minutes = 42
		System.out.println("Month = " + month); // Month = 5

	}

}
