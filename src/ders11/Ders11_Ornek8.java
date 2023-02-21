package ders11;

import java.util.Scanner;

public class Ders11_Ornek8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir cumle isteyin son kelimesini yazdirin
//		012345678910
//		ali eve gel
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		String cumle=scan.nextLine();
	    int boslukIndex=cumle.lastIndexOf(" ");
	    System.out.println(boslukIndex);
	    String sonKelime=cumle.substring(boslukIndex+1);
	    System.out.println(sonKelime);
		
	}

}
