package ders6;

import java.util.Scanner;

public class Ders6_Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan 2 sayi isteyiniz sonra toplama icin +
//		carpma icin * cikarma icin –
//		bolme icin / tusuna basmasini isteyip bu islemleri yaptiriniz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen 2 sayi giriniz");
		
		int say1=scan.nextInt();
		int say2=scan.nextInt();
		
		System.out.println("Toplama icin + cikarma icin - carpma icin * "
				+ "bolme icin / isaretini kullaniniz");
		
		char islem = scan.next().charAt(0);
		
		if(islem=='+') {
			System.out.println("sayilarin toplami="+(say1+say2));
		}else if(islem=='-') {
			System.out.println("sayilarin farki= "+(say1-say2));
		}else if(islem=='*') {
			System.out.println("sayilarin carpimi= "+(say1*say2));
		}else if(islem=='/') {
			System.out.println("Sayilarin bolumu= "+(say1/say2));
		}else {
			System.out.println("yalnis bir tusa tikladiniz");
		}
		
	}

}
