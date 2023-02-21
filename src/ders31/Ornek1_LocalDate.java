package ders31;

import java.time.LocalDate;

public class Ornek1_LocalDate {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
//		plus
		System.out.println(date.plusDays(3));
		System.out.println(date.plusMonths(15));
		System.out.println(date.plusWeeks(3));
		System.out.println(date.plusYears(5));
		System.out.println(date.plusDays(3).plusMonths(5).plusYears(5));
		
//		minus 
		
		System.out.println("***********minus**************");
		System.out.println(date.minusDays(3));
		System.out.println(date.minusMonths(15));
		System.out.println(date.minusWeeks(3));
		System.out.println(date.minusYears(5));
		System.out.println(date.minusDays(3).minusMonths(5).minusYears(5));
//      get		
		System.out.println("********get*****************");
		System.out.println(date.getYear());// yili bize verir
		System.out.println(date.getMonth()); //ayi bize verir
		System.out.println(date.getDayOfMonth()); // ayin kacinci gunu oldugunu verir
		System.out.println(date.getMonthValue());//ayi bize verir rakamsal
		System.out.println(date.getDayOfYear());//yilin kacinci gunu oldugunu verir
		System.out.println(date.getDayOfWeek());//haftanin hangi gunu oldugunu bize verir
		System.out.println(date.getEra());
//		isAfter isBefore of
		System.out.println("********isAfter isBefore of*****************");
		LocalDate date2=LocalDate.of(2025, 12, 8);
		System.out.println(date2.isAfter(date));
		System.out.println(date.isAfter(date2));
		System.out.println(date.isBefore(date2));
		System.out.println(date2.isBefore(date.plusYears(5)));
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
