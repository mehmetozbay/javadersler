package ders6;

import java.util.Scanner;

public class Ders6_Ornek12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		uc basamakli sayi giriniz Kullanicidan bir sayi girmesini isteyiniz sayi 5 ye
//		bolunebiliyorsa sayinin birler
//		basamagini kontrol ediniz eger birler basamagi 0 
//		ise birler basamagi 0 olana ve 5 e tam
//		bolunebilen bir sayi girdiniz yazdiriniz
//		125%5==0 125%10==0 sayi 5ile bolunebilen ve birlerbasamagi 5 olana bir sayidir 

		Scanner scan = new Scanner(System.in);
		System.out.println("uc basamakli bir sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi % 5 == 0) {
			if (sayi % 10 == 0) {
				System.out.println("sayi 5 ile bolunebilen birler basamagi 0 olan bir sayidir");
			} else {
				System.out.println("sayi 5 ile bolunebilen birler basamagi 5 olan bir sayidir");
			}
		} else {
			System.out.println("sayi 5 e bolunmez");
		}

	}

}
