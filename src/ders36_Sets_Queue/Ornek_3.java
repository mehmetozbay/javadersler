package ders36_Sets_Queue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> isimler=new HashSet<>(Arrays.asList("Ali", "Can", "Hasan", "Nergis", "Zeynep", "Tugrul"));
		
//		Setteki 3. elemani bana getir
		
		System.out.println(isimler);
		Iterator<String> it=isimler.iterator();
		int sayac=0;
		while (it.hasNext()) {
			String ad =  it.next();
			sayac++;
			if (sayac==3) {
				System.out.println(ad);
			}
		}
	}

}
