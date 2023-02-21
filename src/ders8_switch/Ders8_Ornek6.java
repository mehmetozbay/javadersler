package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bir ATM uygulamasi yapiniz
//		1-Bakiye
//		2-Para Cekme
//		3- para yatir
//		4 Cikis
		
		Scanner scan=new Scanner(System.in);
		System.out.println("		Bir ATM uygulamasi yapiniz\r\n"
				+ "		1-Bakiye\r\n"
				+ "		2-Para Cekme\r\n"
				+ "		3- para yatir\r\n"
				+ "		4 Cikis");
		
		int sayi=scan.nextInt();
		
		switch (sayi) {
		case 1:
			System.out.println("Bakiye");
			break;
		case 2:
			System.out.println("Para Cekme");
			break;
		case 3:
			System.out.println("Para yatirma");
			break;
		case 4:
			System.out.println("Cikis");
			break;
		default:
			System.out.println("yalnis bir deger girdiniz");
			break;
		}
	}

}
