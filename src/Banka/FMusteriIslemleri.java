package Banka;

import java.util.Scanner;

public class FMusteriIslemleri implements IFBanka{

	Scanner scan=new Scanner(System.in);
	DTOMusteriIslemleri dtoMusteriIslemleri=new DTOMusteriIslemleri();
	@Override
	public void ekle() {
		System.out.println("Adinizi giriniz");
		String ad=scan.nextLine();
		System.out.println("Yasinizi giriniz");
		int yas=scan.nextInt();
		scan.nextLine();
		System.out.println("Adresinizi giriniz");
		String adres=scan.nextLine();
		Musteri musteri=new Musteri(ad, adres, yas);
		dtoMusteriIslemleri.ekle(musteri);
	}
	@Override
	public void sil() {
		System.out.println("Hangi musterinin bilgisini silmek istiyorsunuz");
		int id=scan.nextInt();
		scan.nextLine();
		dtoMusteriIslemleri.sil(id);
	}

	@Override
	public void guncelle() {
		System.out.println("Hangi musterinin bilgisini guncellemek istiyorsunuz");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Adinizi giriniz");
		String ad=scan.nextLine();
		System.out.println("Yasinizi giriniz");
		int yas=scan.nextInt();
		scan.nextLine();
		System.out.println("Adresinizi giriniz");
		String adres=scan.nextLine();
		Musteri musteri=new Musteri(ad, adres, yas);
		dtoMusteriIslemleri.guncelle(id,musteri);
	}
	@Override
	public void bilgiGetir() {
		System.out.println("Hangi musterinin bilgisini getirmek istiyorsunuz");
		int id=scan.nextInt();
		scan.nextLine();
		dtoMusteriIslemleri.bilgiGetir(id);
		
	}
	@Override
	public void hepsiniGetir() {
		
		dtoMusteriIslemleri.hepsiniGetir();
	}

	
	
}
