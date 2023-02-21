package ders22;

public class Siparis {

	Kisi m;
	Urun u;
	int adet;
	public Siparis() {
		// TODO Auto-generated constructor stub
	}
	public Siparis(Kisi m, Urun u, int adet) {
		this.m = m;
		this.u = u;
		this.adet = adet;
	}
	public void faturaYaz() {
		
		System.out.println("Siparisiniz alinmistir");
		System.out.println("Urun ozellikleri\n"+ u.urunAdi+"\nrenk "+u.renk+"\nadet "+adet);
		System.out.println("Musteri bilgileri\n "+m.adi+"Musteri adresi"+m.adres);

	}
}
