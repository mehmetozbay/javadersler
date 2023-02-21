package ders14;

import java.util.Scanner;

public class Ornek_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan 5 tane sayi isteyip kac tanesi cift 
//		oldugunu yazdiran kodu yaziniz
		
//		1. sayiyi gir
//		16
//		0 i sayaca ata
//		for olustur
//		sayiyi al
//		sayinin tek cift olduguna bak
//		sayi cift ise sayac 1 artir
//		sayaci yazdir
		Scanner scan=new Scanner(System.in);
		int sayi, sayac=0;
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1)+". sayiyi giriniz");
			sayi=scan.nextInt();
			if(sayi%2==0) {
				sayac++;
			}
			System.out.println(" sayac " +sayac);
		}
		
		System.out.println("Toplam cift sayilariin sayisi "+sayac);
	}

}
