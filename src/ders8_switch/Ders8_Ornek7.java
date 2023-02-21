package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan 2 sayi isteyiniz sonra toplama icin + carpma icin * cikarma icin –
//		bolme icin / tusuna basmasini isteyip bu islemleri yaptiriniz
		Scanner scan=new Scanner(System.in);
		System.out.println("birinci sayiyiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("ikinci sayiyi giriniz");
		int sayi2=scan.nextInt();
		System.out.println("lutfen toplama icin + cikarma icin - carpma icin * bolme icin / tusuna basiniz");
		char islem=scan.next().charAt(0);
		
		switch (islem) {
		case '+':
			System.out.println("sayilarin toplami= "+(sayi1+sayi2));
			break;
		case '-':
			System.out.println("sayilarin toplami= "+(sayi1-sayi2));
			break;
		case '*':
			System.out.println("sayilarin toplami= "+(sayi1*sayi2));
			break;
		case '/':
			System.out.println("sayilarin toplami= "+(sayi1/sayi2));
			break;
		default:
			System.out.println("yalnis bir tusa bastiniz");
			break;
		}
		
	}

}
