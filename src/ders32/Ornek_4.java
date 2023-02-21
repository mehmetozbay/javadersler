package ders32;

public class Ornek_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Girilen sayilardan ilki haric digerlerini carpan ve
//		ilk sayi ile toplayan sistemi yapiniz
		
		carpTopla(2,3,4,5);
		
		
	}

	private static void carpTopla(int ilkSayi, int ...sayilar) {
		// TODO Auto-generated method stub
		int carpim=1;
		for (int i : sayilar) {
			carpim*=i;
		}
		System.out.println("Sonuc= "+(carpim+ilkSayi));
	}

}
