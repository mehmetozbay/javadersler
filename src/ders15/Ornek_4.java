package ders15;

import java.util.Scanner;

public class Ornek_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Kullanicidan bir sayi isteyin 0 dan baslayip istenen 
//		 sayiya kadar olan sayilari yazdiran
//		 kodu yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi =scan.nextInt();
		int i=0;
		while (i<sayi) {
			System.out.println(i);
			 i++;
		}
		
	}

}
