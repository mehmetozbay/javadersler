package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SiparisSistemi {

	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Urun elbise=new Urun(100,"Elbise","S");
//		Musteri musteri=new Musteri("Ahmet", "Istanbul");
//		Siparis siparis=new Siparis(elbise, musteri, 10);
//		siparis.faturaYaz();
		
		menu();
	}

	private static void menu() {
		
	
		
		UrunIslemleri urunIslemleri=new UrunIslemleri();
		List<Urun> urunler = new ArrayList<>();
		char sec='h';
		while (sec=='h') {
			System.out.println("Urun eklemek icin 1 silmek icin 2 listelemek icin 3 ");
			int key=scan.nextInt();
			scan.nextLine();
			  switch (key) {
				case 1: {
					Urun urun=new Urun();
					System.out.println("Urun adini giriniz");
					urun.adi=scan.nextLine();
					System.out.println("Urun fiyatini giriniz");
					urun.fiyat=scan.nextInt();
					scan.nextLine();
				urunler=urunIslemleri.urunEkle(urun);
			
				break;
				}
				case 2: {
					System.out.println(urunler.get(0));
					urunIslemleri.urunListele(urunler);
					break;
				}
				case 3: {
					System.out.println("Cikis yapiliyor");
					sec='e';
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + key);
				}
		}
	 
		
	}

}
