package ders36_Sets_Queue;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ornek_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> isimler=new LinkedHashSet<>(Arrays.asList("Ali", "Can", "Hasan", "Nergis", "Zeynep", "Tugrul"));
		System.out.println(isimler);
		Set<String> isimler1=new TreeSet<>(Arrays.asList("Ali", "Can", "Hasan", "Nergis", "Zeynep", "Tugrul"));
		System.out.println(isimler1);
		
		Set<Integer> sayilar=new LinkedHashSet<>(Arrays.asList(1,8,4,12,6));
		System.out.println(sayilar);
		Set<Integer> sayilar1=new TreeSet<>(Arrays.asList(1,8,4,12,6));
		System.out.println(sayilar1);
	}

}
