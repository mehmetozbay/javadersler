package Banka;

import java.util.Scanner;

public class Menu {

	Scanner scan=new Scanner(System.in);
	
	public void menuOlustur() {
    int sec;
    boolean cikilsinMi=false;
		while (!cikilsinMi) {
			System.out.println("1-Musteri\n2-Calisan\n3-Cikis");
			sec=scan.nextInt();
			scan.nextLine();
			switch (sec) {
			case 1:
				musteriMenu();
				break;
          case 2:
				calisanMenu();
				break;
          case 3:
				cikilsinMi=true;
				break;
			default:
				System.out.println("Yalnis bir deger girdiniz");
				break;
			}
		}
		
	}

	private void calisanMenu() {
		 int sec;
		    boolean cikilsinMi=false;
				while (!cikilsinMi) {
					System.out.println("1-Musteri Islemleri\n2-Hesap Islemleri\n3-Calisan Islemleri\n4-Cikis");
					sec=scan.nextInt();
					scan.nextLine();
					switch (sec) {
					case 1:
						musteriIslemleriMenu();
						break;
		          case 2:
						hesapIslemleriMenu();
						break;
		          case 3:
						calisanIslemleriMenu();
						break;
		          case 4:
						cikilsinMi=true;
						break;
					default:
						System.out.println("Yalnis bir deger girdiniz");
						break;
					}
				}
		
	}

	private void calisanIslemleriMenu() {
		// TODO Auto-generated method stub
		
	}

	private void hesapIslemleriMenu() {
		// TODO Auto-generated method stub
		
	}

	private void musteriIslemleriMenu() {
		 int sec;
		    boolean cikilsinMi=false;
				while (!cikilsinMi) {
					System.out.println("1-Musteri Ekle\n2-Musteri Sil\n3-Musteri Guncelle\n4-Musteri Bilgisi Getir"
							+ "\n5-Tum Musterileri Getir\n6-Cikis");
					sec=scan.nextInt();
					scan.nextLine();
					
					FMusteriIslemleri musteriIslemleri =new FMusteriIslemleri();
					switch (sec) {
					case 1:
						musteriIslemleri.ekle();
						break;
		          case 2:
						musteriIslemleri.sil();
						break;
		          case 3:
						musteriIslemleri.guncelle();
						break;
		          case 4:
						musteriIslemleri.bilgiGetir();
						break;
		          case 5:
						musteriIslemleri.hepsiniGetir();
						break;
		          case 6:
						cikilsinMi=true;
						break;
					default:
						System.out.println("Yalnis bir deger girdiniz");
						break;
					}
				}
	}

	private void musteriMenu() {
		
		
	}
}
