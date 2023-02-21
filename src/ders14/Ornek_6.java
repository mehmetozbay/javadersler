package ders14;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bilgisayarda rastgele 100 e kadar 10 sayi olusturalim
//		50 den buyuk olanlarin
//		ortalamasini bulan kodu yaziniz
//	

//		60 80 90  60+80+90/3

		int toplam = 0, sayac = 0;
		for (int i = 0; i < 10; i++) {
			int sayi = (int) (Math.random() * 100);
			System.out.println(sayi);
			if (sayi > 50) {
				toplam = toplam + sayi;
				sayac++;
				System.out.println("toplam=" + toplam + "sayac=" + sayac);
			}
		}
		if (sayac > 0) {
			System.out.println("50 den buyuk sayilarin ortalamasi " + (toplam / sayac));
		} else {
			System.out.println("Tum sayilar 50 den kucuktur");
		}
	}

}
