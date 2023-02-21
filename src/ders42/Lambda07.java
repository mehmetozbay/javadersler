package ders42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Isimler listesi olusturun ve icinde A harfi icerenleri ayri bir liste atin

		List<String> isimler = Arrays.asList("Ali", "Ahmet", "can", "Nergis", "Huzeyfe", "Fuat");
		List<String> aHarfliIsimler = isimler.stream().filter(t -> t.contains("A") || t.contains("a"))
				.collect(Collectors.toList());
		System.out.println(aHarfliIsimler);

	}

}
