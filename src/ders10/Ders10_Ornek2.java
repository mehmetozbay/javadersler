package ders10;

import java.util.Scanner;

public class Ders10_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Iki cumle alin hangisinin uzun oldugunu yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ilk cumleyi giriniz");
		String ilkCumle = scan.nextLine();
		System.out.println("Ikinci cumleyi giriniz");
		String ikinciCumle = scan.nextLine();
		int uzunluk1 = ilkCumle.length();
		int uzunluk2 = ikinciCumle.length();
		if (uzunluk1 > uzunluk2) {
			System.out.println("Ilk cumle daha uzun");
		} else if (uzunluk2 > uzunluk1) {
			System.out.println("Ikinci cumle daha uzun");
		} else {
			System.out.println("Cumleler esit uzunluktadiur");
		}

	}

}
