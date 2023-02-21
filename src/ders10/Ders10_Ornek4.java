package ders10;

import java.util.Scanner;

public class Ders10_Ornek4 {
//	Bir String alin ve karakter Sayisi cift ise hepsini buyuk 
//	yazdirin tek ise hepsini
//	kucuk yazdirin
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		int uzunluk=cumle.length();
		if(uzunluk%2==0) {
			System.out.println(cumle.toUpperCase());
		}else {
			System.out.println(cumle.toLowerCase());
		}
		
	}

}
