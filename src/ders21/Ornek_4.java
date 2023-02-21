package ders21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek_4 {

	static Scanner scan = new Scanner(System.in);
	static List<String> kitaplar = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
//		Menu olusturalim 1 icin kitap ekle 2 icin listele 3 cikis
//		Bir Kutuphane sistemine kitap ekleme sistemi olusturunuz ve mevcut olan kitaplari
//		listeleyiniz.

	}

	private static void menu() {

		
		int sec = 0;
		while (sec!=3) {

			System.out.println("1-Kitap ekle\n2-Kitap Listele\n3-Cikis");
			sec = scan.nextInt();
			scan.nextLine();
			switch (sec) {
			case 1:
				kitapEkle();
				break;
			case 2:
				kitapListele();
				break;
			case 3:
				System.out.println("Cikis yapiliyor");
				
				break;
			default:
				System.out.println("Yalnis bir sayi girdiniz");
				break;
			}
		}
	}

	private static void kitapListele() {
	
		for (String each : kitaplar) {
			System.out.println(each);
		}

	}

	private static void kitapEkle() {
		System.out.println("Eklemek istediginiz kitabin ismini giriniz");
		String kitapAdi = scan.nextLine();
		kitaplar.add(kitapAdi);
	}

}
