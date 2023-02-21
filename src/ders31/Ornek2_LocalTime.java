package ders31;

import java.time.LocalTime;
import java.time.ZoneId;

public class Ornek2_LocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime zaman = LocalTime.now();
		System.out.println(zaman);
		System.out.println(zaman.plusHours(4));
		System.out.println(zaman.minusHours(3));
		System.out.println(zaman.plusMinutes(50));
		System.out.println(zaman.minusMinutes(20));
		System.out.println(zaman.plusSeconds(50));
		System.out.println(zaman.plusHours(4).minusMinutes(20).plusSeconds(60));
		
		
//		ZoneId
		
		System.out.println(ZoneId.systemDefault());
		System.out.println(zaman.now(ZoneId.of("Japan")));
		System.out.println(zaman.now(ZoneId.of("Turkey")));
		
	}

}
