package ders31;

import java.time.LocalDate;
import java.time.Period;

public class Ornek5_Period {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate zaman=LocalDate.now();
		LocalDate zaman2=LocalDate.of(2008, 10, 8);
		Period prd=Period.between(zaman2, zaman);
		System.out.println(prd);
		System.out.println("yil" +prd.getYears());
		System.out.println("ay " +prd.getMonths());
	}
}
