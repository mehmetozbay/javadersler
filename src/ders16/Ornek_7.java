package ders16;

import java.util.Scanner;

public class Ornek_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			Sayi tahmin oyunu yapiniz 10 a kadar bilgisayar sayi tutsun siz tahmin edin 
//		kac seferde
//		bildigini yazdiriniz
//		girilen sayi rastgele sayidan kucukse daha buyuk buyukse daha kucuk sayi giriniz
//		5 2 3 5 
//		6 5
		
		Scanner scan =new Scanner(System.in);
		int randomSayi=(int) (Math.random()*11);
		System.out.println("Bir sayi tahmin ediniz");
		int sayi= scan.nextInt();
		int sayac=1;
		while (sayi!=randomSayi) {
			if (sayi>randomSayi) {
				System.out.println("Daha kucuk sayi giriniz");
			}else if(sayi<randomSayi) {
				System.out.println("Daha buyuk sayi giriniz");
			}
			sayi=scan.nextInt();
			sayac++;
		}
		
		System.out.println("Tebrikler "+sayac+" seferde bildiniz");
	}

}
