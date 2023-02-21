package ders34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ornek_1_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>isimler=new ArrayList<>(Arrays.asList("Sena", "Ahmet", "Ali"));
//		System.out.println(isimler);
//		 saa 
		
		ListIterator<String> it=isimler.listIterator();
		while (it.hasNext()) {
			String isim =  it.next();
			it.set(isim+" CAN");
		}
		
		System.out.println(isimler);
	}

}
