package ders35_Sets;

import java.util.HashSet;
import java.util.Set;

public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {2,6,5,5,6,4,8,9,4,7,8,};
		
		Set<Integer> sayilar=new HashSet<>();
		
		for (int i : arr) {
			sayilar.add(i);
		}
		System.out.println(sayilar);
	}

}
