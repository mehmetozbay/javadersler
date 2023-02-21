package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_17 {
	static Scanner scan = new Scanner(System.in);
	static List<String> isimler = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isimler.add("Ali");
		isimler.add("can");
		menu();
	}

	private static void menu() {
		// TODO Auto-generated method stub

		char islem = 'h';
		do {
			System.out.println(
					"Ogrenci kaydi icin 1 ogrenci silme icin 2 ogrenci guncelleme icin 3 u Listeleme icin 4 tiklayiniz");
			int sec = scan.nextInt();
                scan.nextLine();
			switch (sec) {
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
			default:
				break;
			}
		} while (islem != 'e');

	}

	private static void kayitListele() {
		// TODO Auto-generated method stub
	 for (int i = 0; i < isimler.size(); i++) {
		System.out.println(i+1+"-"+isimler.get(i));
	}
	}

	private static void kayitGuncelle() {
		// TODO Auto-generated method stub

	}

	private static void kayitSil() {
		// TODO Auto-generated method stub

	}

	private static void kayitEkle() {
		System.out.println("Eklenecek kisinin ismini yaziniz");
		String isim = scan.nextLine();
		isimler.add(isim);
		
	}

}
