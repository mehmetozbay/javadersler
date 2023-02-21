package ders23;

public class Employe {
//	Employe adinda bir class olusturup Maas hesaplama sistemi yapiniz
//	Calisanin adi maasi calisma saati
//	maasi 450$ den az ise vergi yok cok ise %10 vergi var
//	Calisma saati 176 saat  saatten fazlası ıcın saat bası 20$
	
	String adi;
	int maas;
	int calismaSaati;
	
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}


	public Employe(String adi, int maas, int calismaSaati) {
		this.adi = adi;
		this.maas = maas;
		this.calismaSaati = calismaSaati;
	}
	
//	Maas Hesapla methodu--------------------------------->>>
	
	public void maasHesapla() {
		if (maas>450) {
			int vergi=maas*10/100;
			maas=maas-vergi;
		} 
		if (calismaSaati>176) {
			int mesaiSaati=calismaSaati-176;
			maas+=mesaiSaati*20;
		}
		System.out.println("Merhaba "+adi+" Net Maasiniz="+maas);
	}
}
