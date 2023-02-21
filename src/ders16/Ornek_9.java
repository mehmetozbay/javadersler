package ders16;

import java.util.Scanner;

public class Ornek_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan bir sayi isteyin kac basamakli oldugunu yazdirin
//		12345=>5 basamakli bir sayidir
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		long sayi=scan.nextLong();
		int sayac=0;
		do {
			sayi/=10;
			sayac++;
		} while (sayi!=0);
		
		System.out.println("Sayiniz "+sayac+" basamaklidir");
	}

}
