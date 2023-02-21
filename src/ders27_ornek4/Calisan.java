package ders27_ornek4;

public class Calisan extends Person {
	int saatUcreti;
	int calismaSaati;
	public Calisan() {
		// TODO Auto-generated constructor stub
	}
	public Calisan(String ad, String adres, int yas, String tel, int saatUcreti, int calismaSaati) {
		super(ad, adres, yas, tel);
		this.saatUcreti = saatUcreti;
		this.calismaSaati = calismaSaati;
	}
	public void maasHesapla() {
		System.out.println(ad+" toplam maasiniz "+saatUcreti*calismaSaati);
	}
}
