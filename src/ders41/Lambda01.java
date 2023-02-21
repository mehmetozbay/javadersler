package ders41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> sayilar=Arrays.asList(1,5,25,35,12,15,-20);
		
		for (Integer sayi : sayilar) {
			System.out.println(sayi);
		}
		
//		Lambda ile
		
		System.out.println("-----------------------");
		sayilar.stream().forEach(t->System.out.println(t));
		
		
		
	}

}
