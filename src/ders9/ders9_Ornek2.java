package ders9;

import java.util.Scanner;

public class ders9_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bir cumle isteyin 
//		bas karakterini son karakterini eger uzunlugu tek sayi ise 
//		ortadaki karakteri yazdirin
//		ali

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();

		System.out.println("Ilk harf=" + cumle.charAt(0));

		int uzunluk = cumle.length();

		System.out.println("Cumleni uzunlugu=" + uzunluk);

		System.out.println("Son harf " + cumle.charAt(uzunluk - 1));
//		abcdefg

		if (uzunluk % 2 == 1) {
			int orta = uzunluk / 2;
			System.out.println("Ortadaki harf=" + cumle.charAt(orta));
		}

	}

}
