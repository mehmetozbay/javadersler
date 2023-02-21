package ders6;

import java.util.Scanner;

public class Ders6_Ornek11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir sayi girmesini isteyiniz sayi pozitifse, 
//		sayinin tek veya cift
//		oldugunu kontrol ediniz negatifse negatif bir sayi
//		girdiniz yaziniz

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
//ctrl+shift+F
//		ilk sart sayi>0 mi degilse sayi<0 o da degilse 0 yazdiralim
		if (sayi > 0) {
			if (sayi % 2 == 0) {
				System.out.println("sayi pozitif ve cift sayidir");
			} else {
				System.out.println("sayi pozitif ve tek sayidir");
			}

		} else if (sayi < 0) {
			System.out.println("sayi negatiftir");
		} else {
			System.out.println("sayi 0 dir");
		}

	}

}
