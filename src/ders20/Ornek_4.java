package ders20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		Kullanicidan isimler isteyin ve bunlari bir arrayliste atin
//		 Kullaniciya her islemden sonra cikmak istedigini sorun e derse tum isimleri yazdirin
		
		Scanner scan=new Scanner(System.in);
		List<String> isimler=new ArrayList<>();
		char sec='h';
		while (sec=='h') {
			System.out.println("Bir isim giriniz");
			String isim = scan.nextLine();
			isimler.add(isim);
			System.out.println("Cikmak istiyor musunuz? e veya h");
			sec=scan.next().charAt(0);
			scan.nextLine();
		}
		System.out.println(isimler);
	}
}
