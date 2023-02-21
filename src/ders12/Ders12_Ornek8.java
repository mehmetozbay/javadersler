package ders12;

import java.util.Scanner;

public class Ders12_Ornek8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		int say1=scan.nextInt();
		int say2=scan.nextInt();
		
		int sonuc=topla(say1, say2);
		System.out.println("sayilarin toplami "+sonuc);
		int sonuc2=cikar(say1,say2);
		 System.out.println("sayilarin farki "+sonuc2);
	}

	private static int cikar(int say1, int say2) {
		// TODO Auto-generated method stub
		
		return say1-say2;
	}

	private static int topla(int say1, int say2) {
	    int fark=cikar(2,3);
	    System.out.println("Fark"+fark);
		return say1+say2;
	}

}
