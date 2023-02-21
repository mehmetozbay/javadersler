package ders42;

import java.util.Arrays;
import java.util.List;

public class Lambda02_AllMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sayilar = Arrays.asList(2, 5, 6, -5, 8, 2, 5);
		boolean sonuc=sayilar.stream().allMatch(t->t>0);
		System.out.println(sonuc);
		sonuc=sayilar.stream().noneMatch(t->t>0);
		System.out.println(sonuc);
		sonuc=sayilar.stream().anyMatch(t->t<0);
		System.out.println(sonuc);
	}

}
