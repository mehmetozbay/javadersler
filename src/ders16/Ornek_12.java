package ders16;

import java.util.Scanner;

public class Ornek_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hesap makinasi sistemi yapiniz cikis icin c ye basiniz diger durumlarda devam etsin
//		(toplama icin + cikarma icin - bolme / carpma icin * cikis yapmak istiyormusunuz e 
//		birinci sayiyi giriniz
//		ikinci sayiyi giriniz
//		topla + - / * 
//		sonuc
//		cikis yapmak istiyor musunuz

		Scanner scan=new Scanner(System.in);
		int say1, say2;
		char islem,  cikis;
		do {
			System.out.println("Birinci sayiyi giriniz");
			say1=scan.nextInt();
			System.out.println("Ikinci sayiyi giriniz");
			say2=scan.nextInt();
			System.out.println("(toplama icin + cikarma icin - bolme / carpma icin *)");
			islem=scan.next().charAt(0);
			switch (islem) {
			case '+':
				System.out.println("Islemin sonucu "+(say1+say2));
				break;
			case '-':
				System.out.println("Islemin sonucu "+(say1-say2));
				break;
			case '*':
				System.out.println("Islemin sonucu "+(say1*say2));
				break;
			case '/':
				System.out.println("Islemin sonucu "+(say1/say2));
				break;
			default:
				System.out.println("yalnis bir islem girdiniz");
				break;
			}
			System.out.println("Cikmak istiyor musunuz?");
			cikis=scan.next().charAt(0);
			
		} while (cikis!='e');
		System.out.println("Cikis yapildi");
	}

}
