package ders23;

public class MainEmploye {

	
//	Employe adinda bir class olusturup Maas hesaplama sistemi yapiniz
//	Calisanin adi maasi calisma saati
//	maasi 450$ den az ise vergi yok cok ise %10 vergi var
//	Mesai haftalık 176 saat  saatten fazlası ıcın saat bası 20$
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe calisan=new Employe();
		calisan.adi="Sena";
		calisan.calismaSaati=220;
		calisan.maas=1500;
		calisan.maasHesapla();
		Employe calisan2=new Employe("Can", 1500, 205);
		calisan2.maasHesapla();
	}

}
