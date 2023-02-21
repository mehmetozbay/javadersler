package ders28_ornek3;

import java.util.ArrayList;
import java.util.List;

public class MainSekil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sekil sekil=new Sekil("Kup");
//		sekil.alanHesapla();
//		sekil.cevreHesapla();
		Sekil daire= new Daire("Daire", 12);
//		daire.alanHesapla();
//		daire.cevreHesapla();
		Sekil kare = new Kare("Kare", 10);
//		kare.alanHesapla();
//		kare.cevreHesapla();
		List<Sekil> sekiller = new ArrayList<>();
		sekiller.add(kare);
		sekiller.add(daire);
		sekiller.add(sekil);
		listAlanCevreHesapla(sekiller);
//		alanCevreHesapla(sekil);
//		alanCevreHesapla(daire);
//		alanCevreHesapla(kare);
	}
	public static void alanCevreHesapla(Sekil sekil) {
		sekil.alanHesapla();
		sekil.cevreHesapla();
	}
	
	public static void listAlanCevreHesapla(List<Sekil> sekiller) {
		for (Sekil sekil : sekiller) {
			sekil.alanHesapla();
			sekil.cevreHesapla();
		}
	}
}
