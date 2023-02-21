package ders12;

import java.util.Scanner;

public class Ders12_Ornek14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Kullanicidan sifre yi isteyiniz sonra sifre Tekrar isteyiniz 
//		ayni degilse uyari veren
//		 kodu yaziniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sifreyi giriniz");
		String sifre = scan.nextLine();
		System.out.println("Sifreyi tekrar giriniz");
		String sifreTekrar = scan.nextLine();
		sifreKontrolEt(sifre, sifreTekrar);

	}

	private static void sifreKontrolEt(String sifre, String sifreTekrar) {
		// TODO Auto-generated method stub
		boolean sonuc = sifre.equals(sifreTekrar);
		if (sonuc) {
			System.out.println("Sifre ile sifre tekrar ayni");
		} else {
			System.out.println("Sifre ile sifre tekrar farkli");
		}
	}

}
