package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sayilarin carpimini yapiniz
		List<Integer> sayilar = Arrays.asList(1, 10, 5, 15, 16);
		int sonuc=sayilar.stream().reduce(1,(x,y)->x*y);
		System.out.println(sonuc);
		
	}

}
