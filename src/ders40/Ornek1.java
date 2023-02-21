package ders40;

import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Maasinizi giriniz");
		int maas = scan.nextInt();
		try {
			if (maas < 0) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {

			System.out.println("Maas 0 dan kucuk olamaz");
		}

		System.out.println("devam et");
	}

}
