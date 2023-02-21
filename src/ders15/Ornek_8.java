package ders15;

import java.util.Scanner;

public class Ornek_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan toplamak icin sayi isteyin ve 
//		toplam 1000’e ulasincaya kadar devam
//		istemeyi ettirin. 
//		Toplam 1000’e ulastiginda veya gectiginde toplami ve kac sayi
//		girildigini yazdirin
		

		Scanner scan =new Scanner(System.in);
		int toplam=0;
		int sayac=0;
		int sayi;
		while (toplam<=1000) {
			System.out.println("Bir sayi giriniz");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		}
		
		System.out.println("Sayilarin toplami= "+toplam+" toplam "
				+ sayac +" seferde 1000 i gectiniz");
		
	}

}
