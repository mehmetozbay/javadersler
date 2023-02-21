package ders21;

import java.util.ArrayList;
import java.util.List;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bir String Arraylist olusturup uzunlugu 5 karakterden fazla olan isimleri yazdiriniz.
		
		List<String> isimler=new ArrayList<>();
		isimler.add("Sena");
		isimler.add("Asya");
		isimler.add("nergis");
		for (String each : isimler) {
			if (each.length()>=5) {
				System.out.println(each);
			}
		}
		
	}

}
