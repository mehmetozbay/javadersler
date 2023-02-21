package ders35_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Set<Integer> sayilar=new HashSet<>(Arrays.asList(1,5,6,4,6,7));
		System.out.println(sayilar);
		System.out.println(sayilar.size());
	}

}
