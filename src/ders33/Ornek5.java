package ders33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sayilar=new ArrayList<>();
		sayilar.add(12);
		sayilar.add(25); 
		sayilar.add(35);
		sayilar.add(68);
		sayilar.add(-25);
		
		Iterator<Integer> it=sayilar.iterator();
		
		while (it.hasNext()) {
			int sayi=it.next();
			if (sayi>=25&&sayi<=68) {
			 it.remove();
			}
		}
		System.out.println(sayilar);
	}
}
