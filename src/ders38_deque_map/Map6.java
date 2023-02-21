package ders38_deque_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Map6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, List<String>> ogrenciler=new HashMap<>();
		List<String> isimler1=Arrays.asList("Ahmet", "Can", "Hasan","Nergis");
		ogrenciler.put("1-A", isimler1);
		
		List<String> isimler2=Arrays.asList("Ali", "Sena", "Huzeyfe", "Zafer", "Zeynep");
		ogrenciler.put("2-A", isimler2);
//	s	System.out.println(ogrenciler);
//		System.out.println("sadece 1-A sinifi"+ogrenciler.get("1-A"));
//		System.out.println("Sena ismini yazdiralim "+ogrenciler.get("2-A"));
//		ismi A ile baslayanlari yazdiralim
		System.out.println("Ismi A ile baslayanlar");
		for (List<String> isimlerListesi : ogrenciler.values()) {
			
			System.out.println(isimlerListesi);
			for (String isim : isimlerListesi) {
				if (isim.charAt(0)=='A') {
					System.out.println(isim);
				}
			}
		}
		
	}

}
