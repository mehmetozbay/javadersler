package ders33;

import java.time.LocalTime;

public class Ornek1_stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kelime = "";

		LocalTime zaman = LocalTime.now();

		System.out.println(zaman);

		for (int i = 0; i < 10000; i++) {
			kelime = kelime + i;

		}
		System.out.println(kelime);
		LocalTime zaman1 = LocalTime.now();
		System.out.println(zaman1);
//		669
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i <10000; i++) {
			sb.append(i);
		}
//		90152.500
//		1999.7
		System.out.println(sb);
		LocalTime zaman2 = LocalTime.now();
		System.out.println(zaman2);

	}

}
