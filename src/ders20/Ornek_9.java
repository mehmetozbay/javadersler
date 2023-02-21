package ders20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek_9 {

	public static void main(String[] args) {
//		 Kullanicidan istedigi kadar sayi alin Cikmak istiyor musunuz bunlarin toplamini yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		List<Integer> sayilar= new ArrayList<>();
		
		char sec='h';
		int sayi, toplam=0;
		while (sec=='h') {
			System.out.println("Bir sayi giriniz");
			 sayi=scan.nextInt();
			sayilar.add(sayi);
			toplam+=sayi;
			System.out.println("Cikmak istiyor musunuz?(e,h)");
			sec=scan.next().charAt(0);
		}
		
		System.out.println(sayilar);
		System.out.println("SAyilarin toplami="+toplam);
		
		
	}

}
