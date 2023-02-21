package ders20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek_13 {
	
	static Scanner scan= new Scanner(System.in);
	static List<String> ogrenciler= new ArrayList<>();
	public static void main(String[] args) {
//		Bir okul sistemi olusturunuz
//		-Ogrenci kaydi ekleme
//		-Ogrenci kaydi silme
//		-Ogrenci kaydi guncelleme
//		-Ogrenci listele  yap
//		-Cikis yap
		
		ogrenciler.add("Ahmet");
		ogrenciler.add("Sena");
		menu();
	}
	private static void menu() {
		System.out.println("Ogrenci Sistemine Hosgeldiniz");
		
	
		char sec='h';
		int secenek;
		while(sec=='h')
		{
			System.out.println("*******************************");
			System.out.println("1-Ogrenci Ekleme\n2-Ogrenci Silme\n3-Ogrenci Guncelleme\n4-Ogrenci Listeleme\n5-Cikis");
			secenek=scan.nextInt();
			scan.nextLine();
			switch (secenek) {
			case 1:
				kayitEkle();
				break;
			case 2:
				kayitSil();
				break;
			case 3:
				kayitGuncelle();
				break;
			case 4:
				kayitListele();
				break;
			case 5:
				sec='e';
				System.out.println("Cikis yapiliyor");
				break;
			default:
				System.out.println("Yalnis bir numara sectiniz");
				break;
			}
		}
	}
	private static void kayitListele() {
		for (int i = 0; i < ogrenciler.size(); i++) {
			System.out.println(i+1+"- "+ogrenciler.get(i));
		}
	}
	private static void kayitGuncelle() {
		System.out.println("Hangi numarali kaydi guncellemek istiyorsunuz");
		int numara=scan.nextInt();
		scan.nextLine();
		System.out.println("Yeni isim");
		String isim =scan.nextLine();
		ogrenciler.set(numara-1, isim);
	}
	private static void kayitSil() {
		System.out.println("Hangi numarali ogrenciyi silmek istiyorsunuz");
		int num=scan.nextInt();
		ogrenciler.remove(num-1);
	}
	private static void kayitEkle() {
		System.out.println("Ogrenci adini giriniz");
		String ad=scan.nextLine();
		ogrenciler.add(ad);
	}
}
