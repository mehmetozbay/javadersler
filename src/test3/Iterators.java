package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

	public static void main(String[] args) {
		
		Integer sayilar[]= {2,3,5,6};
		List<Integer>sayilarList=Arrays.asList(sayilar);
		
		
		 
		ListIterator<Integer> list=sayilarList.listIterator();
		for (int i = 0; i < 2; i++) {
			list.set(list.next()+4);
		}
		System.out.println(sayilarList);
		}
		
	}

