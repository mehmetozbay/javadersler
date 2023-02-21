package ders36_Sets_Queue;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> sayilar1=new HashSet<>();
		Long time1=System.currentTimeMillis();
//		System.out.println(time1);
		
		
		for (int i = 0; i <1000000; i++) {
			sayilar1.add(i);
		}
		
//		System.out.print(sayilar1);
		
		Long time2=System.currentTimeMillis();
		System.out.println();
		System.out.println("Hashset calisma zamani=" +(time2-time1));
		
		Set<Integer> sayilar2=new LinkedHashSet<>();
		
		for (int i = 0; i <1000000; i++) {
			sayilar2.add(i);
		}
//		System.out.print(sayilar2);
		Long time3=System.currentTimeMillis();
		System.out.println();
		System.out.println("LinkedHashSet calisma Zamani="+ (time3-time2));
		Set<Integer> sayilar3=new TreeSet<>();
		for (int i = 0; i <1000000; i++) {
			sayilar3.add(i);
		}
		Long time4=System.currentTimeMillis();
		System.out.println();
		System.out.println("TreeSet calisma zamani=" +(time4-time3));
	}

}
