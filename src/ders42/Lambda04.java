package ders42;

import java.util.Arrays;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sayilar=Arrays.asList(1,65,87,7,3,-5,-25);
		int sonuc=sayilar.stream().reduce(0,Math::addExact);
		System.out.println("sayilarin toplami"+sonuc);
		sonuc=sayilar.stream().reduce(1,Math::multiplyExact);
		System.out.println("sayilarin carpimi "+sonuc);
		sonuc=sayilar.stream().reduce(0,Math::min);
		System.out.println("min eleman"+sonuc);
		
	}

}
