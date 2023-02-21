package ders16;

import java.util.Scanner;

public class Ornek_3 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int sayi;
		do {
			System.out.println("Lutfen pozitif "
					+ "bir sayi giriniz");
			sayi=scan.nextInt();
		} while (sayi<=0);
		System.out.println("Tesekkurler");
	}

}
