package ders18;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan 5 tane sayi 
//		isteyiniz 
//		ve
//aramak istediginiz sayiyi 
//		isteyin bu sayinin
//		girilen 5 sayi icerisinde 
//		olup olmadigini kontrol edin

		Scanner scan = new Scanner(System.in);
		int sayilar[] = new int[5];
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i + 1) + ". sayiyi giriniz");
			sayilar[i] = scan.nextInt();
		}
		System.out.println("Aramak istediginiz sayiyi giriniz");
		int arananSayi = scan.nextInt();
		Arrays.sort(sayilar);
		int controlIndex = Arrays.binarySearch(sayilar, arananSayi);
		if (controlIndex >= 0) {
			System.out.println("Aranan sayi bulundu");

		} else {
			System.out.println("Aranan sayi bulunamadi");
		}

	}

}
