package ders5;

import java.util.Scanner;

public class Ders5_Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
//		-5
		if (sayi > 0) {
			System.out.println("sayi pozitiftir");
			System.out.println("sayiniz 0 dan buyuktur");
		}
		if (sayi < 0)
			System.out.println("sayi negatiftir");

		if (sayi == 0)
			System.out.println("sayi sifirdir");

	}

}
