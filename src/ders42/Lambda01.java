package ders42;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		foreach=>foreach

		List<Integer> sayilar = Arrays.asList(2, 5, 6, -5, 8, 2, 5);

		sayilar.stream().forEach(sayi -> System.out.println(sayi));

//		filter=>if
		System.out.println("filter");
		sayilar.stream().filter(t -> t > 0).forEach(t -> System.out.println(t));
//		map
		System.out.println("map");
		sayilar.stream().map(t -> t + 5).forEach(t -> System.out.println(t));
//		distinct:Ayni elemanlari listten siler
		System.out.println("distinct");
		sayilar.stream().distinct().forEach(t -> System.out.println(t));
//		reduce
		System.out.println("reduce");
		int sonuc = sayilar.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sonuc);
//		sorted:Siralama yapmada kullanilir kucukten buyuge
		System.out.println("sorted");
		sayilar.stream().distinct().sorted().forEach(t->System.out.println(t));
//		Tersten siralama
		System.out.println("buyukten kucuge siralama");
		sayilar.stream().distinct().sorted(Comparator.reverseOrder())
		.forEach(t->System.out.println(t));
		System.out.println("limit");
		sayilar.stream().sorted().limit(1).forEach(t->System.out.println(t));
		System.out.println("skip");
		sayilar.stream().distinct().sorted().skip(2)
		.forEach(t->System.out.println(t));
		System.out.println("findFirst");
		int sayi=sayilar.stream().distinct().sorted().findFirst().get();
		System.out.println(sayi);
		

	}

}
