package ders42;

public class Methods {

	public static void yazdir(Object x) {
		System.out.print(x + " ");
	}

	public static int kareAl(int x) {
		return x * x;
	}

	public static int rakamlarToplamiBul(int sayi) {

		int toplam = 0;

		while(sayi!=0) {
		toplam += sayi % 10;

		sayi /= 10;
		}
		return toplam;

	}
}
