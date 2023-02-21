package ders8_string_methods;

import java.util.Scanner;

public class Ders8_Ornek17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bir sifre isteyiniz uzunlugunun 8 karakterden fazla olmasini ve 
//		& / ? Karakterlerinden enaz birini icermesini control ediniz

		Scanner scan = new Scanner(System.in);
		System.out.println("Sifrenizi giriniz");
		String sifre = scan.nextLine();
		boolean uzunluk = sifre.length() > 8;
		boolean ozelKarakter = sifre.contains("&") || sifre.contains("/") || sifre.contains("?");
		if (uzunluk && ozelKarakter) {
			System.out.println("sifre gecerli");
		} else {
			System.out.println("sifre gecersiz");
		}

	}

}
