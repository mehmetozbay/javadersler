package ders21;

public class Ornek_5 {

	int sayi;
	static int rakam;
	static String isim;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hesapla();
		System.out.println(rakam);
		maasHesapla();
	}

	private static void maasHesapla() {
		// TODO Auto-generated method stub
		int saatSayisi = 176;
		int saatUcreti = 12;
		System.out.println(rakam);
		System.out.println(isim);
		System.out.println(saatSayisi*saatUcreti);
		int sayac = 0;
		for (int i = 0; i <10; i++) {
			sayac++;
			int deger=10;
//			System.out.println(deger);
		}
		System.out.println(sayac);
//		System.out.println(deger);
	}

	private void hesapla() {
		
		System.out.println(sayi);
		System.out.println(rakam);
	}
	
	
//	instance variable lar static methodlardan erisilemez\
	
}
