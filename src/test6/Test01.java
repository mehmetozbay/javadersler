package test6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {

//		lambda functional programing collection ve arraylerde kullanilir Map de kullanilmaz
		
		
		
//		sayilar.stream().forEach(t->System.out.println(t));
		
		List<Integer> sayilar=Arrays.asList(2,3,2,4,15,16,7,30);
		sayilar.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
		
		
//		List<String> isimler=Arrays.asList("Ahmet", "Can", "Zasan", "Kaya");
//		
//		isimler.stream().sorted().forEach(t->System.out.println(t));
		
//		Collections.sort(sayilar);
//		System.out.println(sayilar);
//		int toplam=sayilar.stream().reduce(0,(x,y)->x+y);
//		System.out.println(toplam);
//		
		
		
//		List<Integer> sayilar=Arrays.asList(2,3,4,15,16,7,30);
//		for (Integer sayi : sayilar) {
//				System.out.println(sayi*sayi);
//		}
		
		
		//		yazdirLambda(sayilar);
//		System.out.println("********************");
//		ciftleriBul(sayilar);
		
//		kareYazdir(sayilar);
//		farkliElemanKupAl(sayilar);
//		kareToplamAl(sayilar);
		
	}

	

	private static void kareToplamAl(List<Integer> sayilar) {
		
		
	int sayi=	sayilar.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(0,(x,y)->x+y);
		
		System.out.println(sayi);
	}



	private static void farkliElemanKupAl(List<Integer> sayilar) {
		
		sayilar
		.stream()
		.distinct()
		.filter(t->t%2==1)
		.map(t->t*t*t)
		.forEach(t->System.out.println(t));
	}



	private static void kareYazdir(List<Integer> sayilar) {
		
		
		sayilar.stream().filter(t->t%2==0).map(t->t*t).forEach(t->System.out.println(t));
		
	}



	private static void ciftleriBul(List<Integer> sayilar) {
		
		sayilar.stream().filter(sayi->sayi%2==1).forEach(t->System.out.println(t));
		
		
	}

	private static void yazdirLambda(List<Integer> sayilar) {
		
		
		sayilar.stream().forEach(t->System.out.println(t));
		
		
		
	}

	
	
}
