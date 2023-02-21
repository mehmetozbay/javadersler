package test3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> sayilar =new HashSet<>();
		Long time1= System.currentTimeMillis();
		System.out.println(time1);
		for (int i = 0; i < 10000; i++) {
			sayilar.add(i);
		}
		Long time2 =System.currentTimeMillis();
		System.out.println(time2-time1);
		Set<Integer> sayilar1 =new TreeSet<>();
		for (int i = 0; i < 10000; i++) {
			sayilar1.add(i);
		}
		Long time3 =System.currentTimeMillis();
		System.out.println(time3-time2);
	}
}
