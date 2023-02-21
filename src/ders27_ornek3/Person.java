package ders27_ornek3;

public class Person {
	String ad;
	int yas;
	String adres;
	int saatUcreti;
	int id;
	static int idUret=100;
	public Person() {
		this.id =++idUret;
	}
	public Person(String ad, int yas, String adres, int saatUcreti) {
		super();
		this.ad = ad;
		this.yas = yas;
		this.adres = adres;
		this.saatUcreti = saatUcreti;
		this.id = ++idUret;
	}
	
	public void maasHesapla() {
		System.out.println(ad+" maasi "+saatUcreti*176);
	}
	
	public void girisYap() {
      System.out.println(ad+" giris yapti");
	}
}
