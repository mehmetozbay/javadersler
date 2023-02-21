package ders36_Sets_Queue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> isimler=new HashSet<>(Arrays.asList("Ali", "Can", "Hasan", "Nergis", "Zeynep"));
		System.out.println(isimler);
		
		Iterator<String> it=isimler.iterator();
		
		while (it.hasNext()) {
			String ad = (String) it.next();
			System.out.println(ad);
			System.out.println(it.hasNext());
		}
		
		
		
		
	}

}
