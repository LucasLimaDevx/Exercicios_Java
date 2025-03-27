package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Program_0 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("17/01/2025");
		Date y2 = sdf2.parse("17/01/2025 14:32:40");
		Date y3 = sdf3.parse("17/01/2025 14:32:40Z");

		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		System.out.println("------------------------------------");
		
		System.out.println("y1: " + y1); // y1: Fri Jan 17 00:00:00 BRT 2025
		System.out.println("y2: " + y2); // y2: Fri Jan 17 14:32:40 BRT 2025
		System.out.println("y3: " + y3); // y3: Fri Jan 17 11:32:40 BRT 2025
		System.out.println("x1: " + x1); // x1: Tue Jan 21 11:25:17 BRT 2025
		System.out.println("x2: " + x2); // x2: Tue Jan 21 11:25:17 BRT 2025
		System.out.println("x3: " + x3); // x3: Wed Dec 31 21:00:00 BRT 1969
		System.out.println("x4: " + x4); // x4: Thu Jan 01 02:00:00 BRT 1970
		
		
		System.out.println("------------------------------------");
		
		System.out.println("y1: " + y1); // y1: Fri Jan 17 00:00:00 BRT 2025
		System.out.println("y2: " + y2); // y2: Fri Jan 17 14:32:40 BRT 2025
		
		System.out.println("y1: " + sdf2.format(y1)); // y1: 17/01/2025 00:00:00
		System.out.println("y2: " + sdf2.format(y2)); // y2: 17/01/2025 14:32:40
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("x1: " + sdf2.format(x1)); // 18/01/2025 11:05:20
		System.out.println("x2: " + sdf2.format(x2)); // 18/01/2025 11:05:20
		System.out.println("x3: " + sdf2.format(x3)); // 31/12/1969 21:00:00
		System.out.println("x4: " + sdf2.format(x4)); // x4: 01/01/1970 02:00:00
		
		System.out.println("------------------------------------");
		
		System.out.println("y1: " + y1); // y1: Fri Jan 17 00:00:00 BRT 2025
		System.out.println("y2: " + y2); // y2: Fri Jan 17 14:32:40 BRT 2025
		
		System.out.println("y1: " + sdf3.format(y1)); // y1: 17/01/2025 03:00:00
		System.out.println("y2: " + sdf3.format(y2)); // y2: 17/01/2025 17:32:40
		System.out.println("y3: " + sdf3.format(y3)); // y3: 17/01/2025 14:32:40
		System.out.println("x1: " + sdf3.format(x1)); // x1: 21/01/2025 14:25:17
		System.out.println("x2: " + sdf3.format(x2)); // x2: 21/01/2025 14:25:17
		System.out.println("x3: " + sdf3.format(x3)); // x3: 01/01/1970 00:00:00
		System.out.println("x4: " + sdf3.format(x4)); // x4: 01/01/1970 05:00:00
		
		
	}

}
