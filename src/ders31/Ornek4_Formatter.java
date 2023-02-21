package ders31;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ornek4_Formatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate tarih=LocalDate.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy");//25/11/22
		System.out.println(dtf.format(tarih));
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yyyy");//25/11/2022
		System.out.println(dtf1.format(tarih));
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/M/yyyy");//25/6/2022
		System.out.println(dtf2.format(tarih.minusMonths(5)));
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MM/yyyy");//25/06/2022
		System.out.println(dtf3.format(tarih.minusMonths(5)));
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd/MMM/yyyy");//25/06/2022
		System.out.println(dtf4.format(tarih));
		DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");//25/November/2022
		System.out.println(dtf5.format(tarih));
		DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("dd/MMMM/yyyy", new Locale("de"));
		System.out.println(dtf6.format(tarih.minusMonths(8)));
		
//		time Formatter
		LocalTime zaman=LocalTime.now();
		DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf7.format(zaman));
		DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf8.format(zaman));
		System.out.println(dtf4.format(tarih)+" "+dtf8.format(zaman));
		
		
		
	}

}
