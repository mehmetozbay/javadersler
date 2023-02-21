package ders27_ornek4;

public class Person extends Hastane{
	String ad;
	String adres;
	int yas;
	String tel;
	static int kisiSayisi;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String ad, String adres, int yas, String tel) {
		super();
		this.ad = ad;
		this.adres = adres;
		this.yas = yas;
		this.tel = tel;
	}
	
	public void girisYap() {
     System.out.println(ad+" giris yapti");
     kisiSayisi++;
     System.out.println("Toplam kisi sayisi= "+kisiSayisi);
	}
	
	public void cikisYap() {
		System.out.println(ad+" cikis yapti");
		kisiSayisi--;
		System.out.println("toplam kisi sayisi= "+kisiSayisi);
	}
	
}
