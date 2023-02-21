package test3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SertsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int arr[]= {2,4,5,4,5,6,6};
//		Set<Integer> sayilar=new HashSet<>();
//		for (int i : arr) {
//			sayilar.add(i);
//		}
//	  System.out.println(sayilar);
		
		
	   Set<String> isimler =new TreeSet<>();
	   isimler.add("Veli");
	   isimler.add("Sena");
	   isimler.add("Yunus");
	  
	   Set<String> isimler2=new TreeSet<>();
	   isimler2.add("Hasan");
	   isimler2.add("Sena");
	   isimler2.add("Yunus");
	   System.out.println(isimler.retainAll(isimler2));
	   System.out.println(isimler);
	}
}
