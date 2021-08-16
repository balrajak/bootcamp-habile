package day1;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class LocalDateEx {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
					
		LocalDate ld1 = LocalDate.of(2021, 8, 16);
		System.out.println(ld1);
		
			
		LocalDate date1=LocalDate.of(2021, 8, 16);
		LocalDate date2=LocalDate.of(1990, 11, 3);
		 
		Period diff = Period.between(date2, date1);
		System.out.printf("Difference is %d years, %d months and %d days old", 
	            diff.getYears(), diff.getMonths(), diff.getDays());
		
		LocalDate date3=ld.plusDays(2);
		System.out.println();
		System.out.println(date3);
		
		///////////////////////////
				
	}

}
