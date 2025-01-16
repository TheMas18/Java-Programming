package Java8.Streams;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeApi {
	public static void main(String[] args) {
		
//			LocalDate now=LocalDate.now();
//			System.out.println(now);
//			LocalDate customDate=LocalDate.of(1990,2,7);
//			System.out.println(customDate);
//			int dayOfMonth = now.getDayOfMonth();
//			int year = now.getYear();
//			Month month = now.getMonth();
//			int monthValue = now.getMonthValue();
//			System.out.println(dayOfMonth);
//			System.out.println(year);
//			System.out.println(month);
//			System.out.println(monthValue);
			
//			LocalDate today=LocalDate.now();
//			LocalDate yesterday = today.minusDays(1);
//			LocalDate prevMonth = today.minusMonths(2);
//			System.out.println(yesterday);
//			System.out.println(prevMonth);
		
		LocalTime now=LocalTime.now();
		System.out.println(now);
		LocalTime customTime = LocalTime.of(14, 30,30);
		System.out.println(customTime);
		
	}
}
