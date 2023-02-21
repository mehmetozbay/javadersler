package ders20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ornek_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> sayilar=new ArrayList<>();
		sayilar.add(15);
		sayilar.add(2);
		sayilar.add(25);
		sayilar.add(12);
		System.out.println(sayilar);
//		siralama yaptiriyor
		Collections.sort(sayilar);
		System.out.println(sayilar);
		System.out.println("Buyukten kucuge siralama");
		for (int i = sayilar.size()-1; i >= 0; i--) {
			System.out.print(sayilar.get(i)+" ");
		}
	
		
	}

}
