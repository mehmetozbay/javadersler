package ders16;

import java.util.Scanner;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sayi tahmin oyunu yapiniz 10 a kadar bilgisayar sayi tutsun siz tahmin edin 
//		kac seferde
//		bildigini yazdiriniz
		
		Scanner scan =new Scanner(System.in);
		int randomSayi= (int) (Math.random()*11);
		System.out.println("Lutfen bir sayi tahmin ediniz");
		int sayi=scan.nextInt();
		int sayac=1;
		while (sayi!=randomSayi) {
			System.out.println("Bilemediniz bir sayi daha tahmin ediniz");
			sayi=scan.nextInt();
			sayac++;
		}
		
		System.out.println("Tebrikler "+sayac+" seferde bildiniz ");
		
		
	}

}
