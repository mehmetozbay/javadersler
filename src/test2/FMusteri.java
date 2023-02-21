package test2;

import java.util.Scanner;

public class FMusteri {

	Scanner scan=new Scanner(System.in);
	public void ekle() {
		System.out.println("Adinizi giriniz");
		String ad=scan.nextLine();
		System.out.println("Yasinizi giriniz");
		int yas =scan.nextInt();
		scan.nextLine();
		System.out.println("Adresinizi giriniz");
		String adres=scan.nextLine();
		Musteri musteri=new Musteri(ad,adres,yas);
		
		DTOMusteri dtoMusteri=new DTOMusteri();
		dtoMusteri.add(musteri);
	}
	public void sil() {
		System.out.println("Silmek sitediginiz bir musteri id si giriniz");
		int id=scan.nextInt();
		scan.nextLine();
		DTOMusteri dtoMusteri=new DTOMusteri();
		dtoMusteri.delete(id);
	}
	public void guncelle() {
		System.out.println("Adinizi giriniz");
		String ad=scan.nextLine();
		System.out.println("Yasinizi giriniz");
		int yas =scan.nextInt();
		scan.nextLine();
		System.out.println("Adresinizi giriniz");
		String adres=scan.nextLine();
		Musteri musteri=new Musteri(ad,adres,yas);
		
		System.out.println("Hangi musteriyi guncellemek istiyorsunuz");
		int id= scan.nextInt();
		scan.nextLine();
		DTOMusteri dtoMusteri=new DTOMusteri();
		musteri.setId(id);
		Musteri.sayi--;
		dtoMusteri.update(id, musteri);
		
		
	}
	public void getMusteriler() {
		
		DTOMusteri dtoMusteri=new DTOMusteri();
		dtoMusteri.getMusteries();
	}
	public void getMusteri() {
		System.out.println("Lutfen getirmek istediginiz kisinin id sini giriniz ");
		int id =scan.nextInt();
		DTOMusteri dtoMusteri=new DTOMusteri();
		dtoMusteri.getMusteri(id);
	}
	
}
