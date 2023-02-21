package test6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> isimler = Arrays.asList("Ali", "Ahmet", "Can", "Hasan", "Zeynep");
		 isimler.stream().sorted().peek(e->System.out.println(e)).collect(Collectors.toList());
//		System.out.println(sonuc.get());
//		Stream.of("one", "two", "three", "four")
//		  .filter(e -> e.length() > 3)
//		  .peek(e -> System.out.println("Filtered value: " + e))
//		  .map(String::toUpperCase)
//		  .peek(e -> System.out.println("Mapped value: " + e))
//		  .collect(Collectors.toList());
//		isimler.stream().sorted(Comparator.comparing(String::length)
//				.thenComparing(t->t.charAt(t.length()-1))).forEach(t->System.out.println(t));
//		isimler.stream().sorted(Comparator.comparing(String::length))
//		.forEach(t->System.out.println(t));
//		System.out.println("============");
//		isimler.stream().sorted(Comparator.comparing(String::length).reversed())
//		.forEach(t->System.out.println(t));
//		isimler.stream().map(String::toLowerCase).forEach(t->System.out.println(t));
//		System.out.println("=============");
//		isimler.stream().map(String::toUpperCase).forEach(t->System.out.println(t));

//		Optional<Integer> minSayi=sayilar.stream().sorted().limit(1).findAny();
//		System.out.println(minSayi.get());
	}

	private static void yazdir(int x) {
		System.out.print(" " + x);
	}

	private static int kareAl(int x) {
		// TODO Auto-generated method stub
		return x * x;
	}

	private static int rakamlariToplamiBul(int sayi) {
		int toplam = 0;
		while (sayi != 0) {
			toplam += sayi % 10;
			sayi /= 10;
		}
		return toplam;
	}
}
