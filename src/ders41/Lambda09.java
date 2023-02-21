package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> sayilar = Arrays.asList(1, 10, 5, 15, 16);

		int toplam = 0;
		for (Integer sayi : sayilar) {
			toplam = toplam + sayi;
		}
		System.out.println(toplam);
		System.out.println("==========================");
		
		
		int sonuc = sayilar.stream().reduce(0, (toplam1, sayi) -> toplam1 + sayi);
		System.out.println(sonuc);

	}

}
