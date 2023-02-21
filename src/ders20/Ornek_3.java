package ders20;

import java.util.ArrayList;
import java.util.List;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Bir tane hayvanlar adinda arraylist olusturalim ve hayvan isimleri ekleyelim
//		yazdiralim
		
		List<String> hayvanlar=new ArrayList<>();
		hayvanlar.add("Kedi");
		hayvanlar.add("Kopek");
		hayvanlar.add("Inek");
		hayvanlar.add("Yilan");
//		yukaridaki arraylisti alt alta basina numara koyarak  yaziniz
		for (int i = 0; i < hayvanlar.size(); i++) {
			System.out.println(i+1+"- "+hayvanlar.get(i));
		}
		System.out.println("***************************");
		hayvanlar.remove(1);
		hayvanlar.remove("Yilan");
		for (int i = 0; i < hayvanlar.size(); i++) {
			System.out.println(i+1+"- "+hayvanlar.get(i));
		}
		
	}
}
