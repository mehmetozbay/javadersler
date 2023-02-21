package ders6;

import java.util.Scanner;

public class Ders6_Ornek13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanici tarafindan girilen  3 tane sayiyi buyukten kucuge siralayiniz

		Scanner scan = new Scanner(System.in);

		System.out.println("Uc tane sayi giriniz");
		int say1 = scan.nextInt();
		int say2 = scan.nextInt();
		int say3 = scan.nextInt();

		if (say1 > say2 && say1 > say3) {
//			say1 enbuyuk
			if (say2 > say3) {
				System.out.println("buyukten kucuge" + say1 + ">" + say2 + ">" + say3);
			} else {
				System.out.println("buyukten kucuge" + say1 + ">" + say3 + ">" + say2);
			}
		} else if (say2 > say1 && say2 > say3) {
//			en buyuk say2
			if (say1 > say3) {
				System.out.println("buyukten kucuge" + say2 + ">" + say1 + ">" + say3);
			} else {
				System.out.println("buyukten kucuge" + say2 + ">" + say3 + ">" + say1);
			}
		} else if (say3 > say1 && say3 > say2) {
			if (say1 > say2) {
				System.out.println("buyukten kucuge" + say3 + ">" + say1 + ">" + say2);
			} else {
				System.out.println("buyukten kucuge" + say3 + ">" + say2 + ">" + say1);

			}
		}

	}

}
