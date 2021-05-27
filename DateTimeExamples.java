package examples.java.dateTimeApi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class DateTimeExamples {
	public static void main(String[] args) {
		// For representing date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println("Date of month" + date.getDayOfMonth() + " Day of Year " + date.getDayOfYear() + " Month"
				+ date.getMonth());
		System.out.printf("%d-%d-%d", date.getDayOfMonth(), date.getMonth().getValue(), date.getYear());
		// For representing time
		LocalTime time = LocalTime.now();
		System.out.println("Local TIme: " + time);
		System.out.println("Hour:" + time.getHour() + " Min:" + time.getMinute() + " Sec:" + time.getSecond());
		// For representing both date and time

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getMonthValue());
		LocalDateTime of = LocalDateTime.of(1992, 11, 1, 3, 30);
		System.out.println("Sush DOB:" + of);

		System.out.println(of.plusDays(10));
		System.out.println(of.plusMonths(5));
	}

}
