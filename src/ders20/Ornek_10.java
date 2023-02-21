package ders20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ornek_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Kullanicidan istedigi kadar sayi alin bunlarin en buyugunu ve en kucugunu yazdiriniz
		List<Integer> sayilar= new ArrayList<>();
		Scanner scan= new Scanner(System.in);
		char sec='h';
		int sayi;
		while (sec=='h') {
			System.out.println("Bir sayi giriniz");
			 sayi=scan.nextInt();
			sayilar.add(sayi);
			System.out.println("Cikmak istiyor musunuz?(e,h)");
			sec=scan.next().charAt(0);
		}
		
		int uzunluk= sayilar.size();
		Collections.sort(sayilar);
		System.out.println(sayilar);
		System.out.println("En kucugu "+sayilar.get(0));
		System.out.println("En buyugu "+sayilar.get(uzunluk-1));
	}

}
