package ders7;

import java.util.Scanner;

public class Ders7_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	 Girilen sayinin mutlak degerini alan kodu yaziniz
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int sonuc=sayi>0?sayi:sayi*-1;
		
		System.out.println("sayinin mutlak degeri ="+sonuc);
				
		
	}

}
