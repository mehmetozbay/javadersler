package ders29_ornek1;

import java.util.ArrayList;
import java.util.List;

public class MainCalisanlar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Isci isci=new Isci("Ali", 12, 170);
//		System.out.println(isci.getAd()+" personelin maasi "+isci.maasHesapla());
		Memur memur=new Memur("Sena", 15, 176);
//		System.out.println(memur.getAd()+" personelin maasi "+memur.maasHesapla());
		Manager mudur=new Manager("Ahmet",20,176);
		GenelMudur gMudur=new GenelMudur("Zeynep", 25, 176);
		List<Personel> calisanlar =new ArrayList<>();
		calisanlar.add(memur);
		calisanlar.add(isci);
		calisanlar.add(mudur);
		calisanlar.add(gMudur);
		listMaasHesapla(calisanlar);
//		genelMaasHesapla(isci);
//		genelMaasHesapla(memur);
//		genelMaasHesapla(mudur);
	}
	public static void genelMaasHesapla(Personel p) {
		System.out.println(p.getAd()+" personelin maasi "+p.maasHesapla());
	}
	
	public static void listMaasHesapla(List<Personel> calisanlar) {
		for (Personel p : calisanlar) {
			System.out.println(p.getAd()+" personelin maasi "+p.maasHesapla());
		}
	}
}
