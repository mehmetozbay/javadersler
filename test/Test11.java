package test;

import java.util.Scanner;

public class Test11 {
	static Scanner scan = new Scanner(System.in);
	static int balance = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sayi=1553;
//		int toplam=0;
//		while(sayi!=0) {
//			int rakam=sayi%10;
//			toplam+=rakam;
//			sayi/=10;
//		}
//
//		System.out.println(toplam);

//	=====================================================================	
//		System.out.println("Pin kodunu giriniz");
//		int pin=scan.nextInt();
//		int userPin=1453;
//		while(userPin!=pin) {
//			System.out.println("Pin kodunu giriniz");
//			 pin=scan.nextInt();
//		}
//		=========================================================

//		boolean sonuc = false;
//
//		while (!sonuc) {
//			System.out.println("Bir sayi giriniz");
//			String deger=scan.next();
//			int karakterIndex = 0, sayac = 0;
//			while (karakterIndex < deger.length()) {
//				if (!(deger.charAt(karakterIndex) >= '0' && deger.charAt(karakterIndex) <= '9')) {
//					sayac++;
//					System.out.println(sayac);
//				}
//				karakterIndex++;
//			}
//
//			if (sayac != 0) {
//				sonuc = false;
//			} else {
//				sonuc = true;
//			}
//		}

//		int sayi = (int) (Math.random() * 10);
//		int girilenSayi;
//		do {
//			System.out.println("bir sayi giriniz");
//			girilenSayi = scan.nextInt();
//			
//		} while (sayi != girilenSayi);

//		int sayi=0;
//		do {
//			System.out.println(sayi);
//			sayi++;
//		} while (sayi<10);
//		
//		int sayi, toplam=0;
//		
//		do {
//			System.out.println("bir sayi giriniz");
//			sayi=scan.nextInt();
//			toplam+=sayi;
//		} while (sayi!=0);
//		System.out.println("Toplam="+toplam);

//		char islem;
//		int sayi1, sayi2;
//		do {
//			System.out.println("1.sayiyi giriniz");
//			sayi1=scan.nextInt();
//			System.out.println("Islemi giriniz");
//			islem=scan.next().charAt(0);
//			System.out.println("2.sayiyi giriniz");
//			sayi2=scan.nextInt();
//		switch (islem) {
//		case '+':
//			System.out.println("sonuc"+(sayi1+sayi2));
//			break;
//		case '-':
//			System.out.println("sonuc"+(sayi1-sayi2));
//			break;
//		case '*':
//			System.out.println("sonuc"+(sayi1*sayi2));
//			break;
//		case '/':
//			System.out.println("sonuc"+(sayi1/sayi2));
//			break;
//		default:
//			System.out.println("yalnis islem sectiniz");
//			break;
//		}
//			
//		} while (islem!='C');
//		

		char sec;
		do {
			System.out.println("Bir islem seciniz");
			sec = scan.next().charAt(0);
			switch (sec) {
			case '1':

				paraCekme();
				break;
			case '2':

				paraYatirma();
				break;
			case 'c':

				System.out.println("cikis yapiliyor");
				break;
			default:
				break;
			}

		} while (sec != 'c');
	}

	private static void paraYatirma() {
		System.out.println("Ne kadar para yatirmak istiyorsunuz");
		int yatirilanPara = scan.nextInt();
		balance += yatirilanPara;
	}

	private static void paraCekme() {
		System.out.println("Ne kadar para cekmek istiyorsunuz");
		int cekilenPara = scan.nextInt();
		balance -= cekilenPara;
	}

}
