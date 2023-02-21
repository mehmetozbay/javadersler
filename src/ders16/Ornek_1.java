package ders16;

import java.util.Scanner;

public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Kullanicidan pozitif bir sayi isteyiniz negative girmesini engelleyiniz
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen pozitif bir sayi giriniz");
		int sayi=scan.nextInt();
		while (sayi<=0) {
			System.out.println("Lutfen pozitif bir sayi giriniz");
			sayi=scan.nextInt();
		}
		
		System.out.println("Tesekkurler");
	}

}
