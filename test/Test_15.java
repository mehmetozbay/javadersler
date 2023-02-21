package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test_15 {

	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();

		isimler.add("Ahmet");
		isimler.add("Can");
		isimler.add("Cemil");
		isimler.add("Asli");

		System.out.println(isimler.contains("Ahmet"));

//		System.out.println(isimler.get(0));

		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(19);
		sayilar.add(10);
		sayilar.add(12);
		Collections.sort(sayilar);
		System.out.println(sayilar);
		
		
	}
}
