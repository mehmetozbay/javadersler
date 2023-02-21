package ders13;

import java.util.Scanner;

public class Ornek_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir sayi isteyin 0 dan baslayip istenen 
//		sayiya kadar olan sayilarin 3 katini
//		ekrana yazdiran kodu yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		for (int i = 0; i < sayi; i++) {
//			i*=3;
			System.out.println(3*i);
		}
		
		
		
	}

}
