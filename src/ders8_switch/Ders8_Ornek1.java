package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Reservasyon icin 1 bilgi islem icin 2 dilek sikayet "
				+ "icin 3 cikis icin 4 tiklayiniz");

		int num=scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Reservasyona hos geldiniz");
			break;
		case 2:
			System.out.println("Bilgi islem icin hos geldiniz");
			break;
		case 3:
			System.out.println("Dilek ve Sikayet  icin hos geldiniz");
			break;
		case 4:
			System.out.println("cikis  yaptiniz");
			break;
		default:
			System.out.println("Yalnis bir tusa tikladiniz");
			break;
		}
	}

}
