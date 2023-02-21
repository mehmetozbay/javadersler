package ders12;

import java.util.Scanner;

public class Ders12_Ornek10 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan iki sayi aliniz toplama, cikarma, carpma, bolme yapiniz
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		int say1=scan.nextInt();
		int say2=scan.nextInt();
		int sonuc=topla(say1,say2);
	
		System.out.println("sayilarin toplami "+sonuc);
		 sonuc=cikar(say1,say2);
		System.out.println("sayilarin farki"+sonuc);
		sonuc=carp(say1,say2);
		System.out.println("sayilarin carpimi"+sonuc);
		sonuc=bol(say1,say2);
		System.out.println("sayilarin bolumu"+sonuc);
		
	}

	private static int bol(int say1, int say2) {
		// TODO Auto-generated method stub
		return say1/say2;
	}

	private static int carp(int say1, int say2) {
		// TODO Auto-generated method stub
		return say1*say2;
	}

	private static int cikar(int say1, int say2) {
		// TODO Auto-generated method stub
		return say1-say2;
	}

	private static int topla(int say1, int say2) {
		// TODO Auto-generated method stub
		return say1+say2;
	}

}
