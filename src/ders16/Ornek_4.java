package ders16;

import java.util.Scanner;

public class Ornek_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan cift sayi girmesini saglayiniz 
		
		Scanner scan=new Scanner(System.in);
		int sayi;
		do {
		System.out.println("Lutfen bir cift sayi giriniz");	
		sayi=scan.nextInt();
		} while (sayi%2!=0);
		
		System.out.println("Tebrikler");
		
		
	}

}
