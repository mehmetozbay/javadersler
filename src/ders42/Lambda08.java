package ders42;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> isimler = Arrays.asList("Ali", "Ahmet","Hasan", "Can", "Nergis", "Huzeyfe", "Fuat");
		
		isimler.stream().sorted(Comparator.comparing(String::length)).forEach(Methods::yazdir);
		System.out.println("\nTersten Siralaniyor");
		isimler.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Methods::yazdir);
		System.out.println("\nSon harfe gore siralama yapalim");
		isimler.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
		.forEach(Methods::yazdir);
//		uzunluk ve son harf
		System.out.println("\nuzunluk ve son harfe gore siralama");
		isimler.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0)))
		.forEach(Methods::yazdir);
	}
}
