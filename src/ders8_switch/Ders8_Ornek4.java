package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		3 Takimimiz var Galatasaray icin G Fenerbahce icin F Besiktas icin B 
//	Takimi gormek icin bu harflerden birini giriniz
	
		Scanner scan =new Scanner(System.in);
		System.out.println("Galatasaray icin G Fenerbahce icin F Besiktas icin B seciniz");
		char takim=scan.next().charAt(0);
		
		switch (takim) {
		case 'G':
			System.out.println("a b c");
			break;
		case 'F':
			System.out.println("d e f");
			break;
		case 'B':
			System.out.println("g h i");
			break;
		default:
			System.out.println("Yalnis bir deger girdiniz");
			break;
		}
		
	}

}
