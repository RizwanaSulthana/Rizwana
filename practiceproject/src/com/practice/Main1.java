package com.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.sound.midi.SysexMessage;

public class Main1 {

	public static void main(String[] args) {
		
		
		LocalDate today =LocalDate.now();
		LocalDate dob=LocalDate.of(1999,6,6);
		System.out.println(today);
		System.out.println(dob);
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println(df.format(today));
		System.out.println(df.format(dob));
		
		LocalDate nextDay=dob.plusDays(30);
		LocalDate nextDay1=today.plusDays(30);
		System.out.println(df.format(nextDay1));
		System.out.println(df.format(nextDay));
		
		
		
		LocalDate nextDate=today.plusMonths(3);
		System.out.println(df.format(nextDate));
		
		
		Period p= Period.of(3, 5, 20);//date aftr 3 yrs,5 mnths,20days
		System.out.println(p);
		
		LocalDate expiry=(LocalDate)p.addTo(today);
		System.out.println(expiry);
		
		Period p1=Period.between(dob, today);//calculate period btw 2 dates
		System.out.println(p1);
		System.out.println(p1.getYears() +"years" + p1.getMonths() +"months " + p1.getDays() + "days ");


	}

}
