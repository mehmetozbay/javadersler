package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek11 {

	public static void main(String[] args) {
//		10.	Bir firma eski müşterilerine indirim yapmak istemistir 
//		-10 yıldan eski müşterilerine %10, 20 yıldan eski müşterilerine %20 indirim yapmaktadır.
//		- Eğer bu eski müşteriler 1000 liradan fazla alışveriş yapmışsa,  
//		10 yıldan eski müşterilerine %5, 
//		20 yıldan eski müşterilerine %10 extra indirim yapmaktadır. 
//		-Eğer eski müşteri değil ve 1000 liradan fazla alışveriş yapmışsa %3 indirim yapınız.
//
//		Kullanıcıdan kaç yıllık bir müşteri olduğunu ve ne kadarlık bir alışveriş yaptığını sorunuz 
//		Sonuç olarak ekrana indirimlerle birlikte toplam tutarı yazdırınız. Indirim alamamıssa 
//		tutar ile birlikte indirim alabilmesi için ne kadarlık daha alışveriş 
//		yapması gerektiğini yazdırınız.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("kac yillik musterisiniz");
		int yil=scan.nextInt();
		System.out.println("Ne kadarlik alisveris yaptiniz");
		int ucret=scan.nextInt();
		
		int yuzdeOnIndirim=ucret*10/100;
		int yuzdeBesIndirim=ucret*5/100;
		int yuzdeYirmiIndirim=ucret*20/100;
		int yuzdeUcIndirim=ucret*3/100;
		
		
		if(yil>=10&&yil<20) {
			if(ucret>=1000) {
				ucret=ucret-yuzdeOnIndirim-yuzdeBesIndirim;
				System.out.println("Indirimlerle beraber toplam tutar"+ucret);
			}else {
				ucret=ucret-yuzdeOnIndirim;
				System.out.println("Indirimlerle beraber toplam tutar"+ucret);
			}
		}
		if(yil>=20) {
			if(ucret>=1000) {
				ucret=ucret-yuzdeYirmiIndirim-yuzdeOnIndirim;
				System.out.println("Indirimlerle  beraber toplam tutar"+ucret);
			}else {
				ucret=ucret-yuzdeYirmiIndirim;
				System.out.println("Indirimlerle beraber toplam tutar"+ucret);
			}
		}
		
		if(yil<10) {
			if(ucret>=1000) {
				ucret=ucret-yuzdeUcIndirim;
				System.out.println("Indirimlerle beraber toplam tutar"+ucret);
			}else {
				System.out.println("Ucretiniz"+ucret+"indirim alabilmeniz icin "+(1000-ucret)+
						"alisveris yapmaniz gerekmekte");
			}
		}

		
		
		
	}

}
