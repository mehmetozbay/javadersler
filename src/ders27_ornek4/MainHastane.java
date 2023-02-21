package ders27_ornek4;

public class MainHastane {
	public static void main(String[] args) {
		Hastane.hastaneAdi = "SGK";
		Hastane.hastaneAdresi = "Istanbul";
		Hastane.tel = "45454545";
		Calisan calisan = new Calisan("Sena", "Frankfurt", 16, "232232323", 25, 150);
		calisan.maasHesapla();
		System.out.println(calisan.hastaneAdi);
		calisan.girisYap();
		Hasta hasta = new Hasta("Ali", "Ankara", 15, "154545", "Bas Agrisi", "Parol");
		hasta.girisYap();
		hasta.randevuAl();
	}
}
