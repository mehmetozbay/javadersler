package ders20;

import java.util.ArrayList;
import java.util.List;

public class Ornek_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bir okul sistemi olusturunuz
//		-Ogrenci kaydi ekleme
//		-Ogrenci kaydi silme
//		-Ogrenci kaydi guncelleme
//		-Ogrenci listele sistemi yapiniz
		List<String> hayvanlar=new ArrayList<>();
		hayvanlar.add("Kedi");
		hayvanlar.add("Kopek");
		hayvanlar.add("Inek");
		hayvanlar.add("Yilan");
		Object arr[]=hayvanlar.toArray();
		System.out.println(arr[0]);
		
		
	}

}
