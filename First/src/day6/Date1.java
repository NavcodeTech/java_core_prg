package day6;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date1 {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalDate date1=LocalDate.of(2022, 7, 8);
		System.out.println(date1);
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		System.out.println(localTime.NOON);
		System.out.println(localTime.MIDNIGHT);
		System.out.println(localTime.MIN);
		System.out.println(localTime.MAX);
		
		LocalTime localTime2=LocalTime.of(10,20, 34);
		System.out.println(localTime2);
		
		LocalTime dt=LocalTime.now();
		System.out.println(dt);
	}
}
