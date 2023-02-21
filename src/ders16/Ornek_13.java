package ders16;

import java.util.Scanner;

public class Ornek_13 {
	static Scanner scan=new Scanner(System.in);
	static int balance=1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bir ATM sistemi yapiniz hesapta 1000 lira olsun para yatirma para cekme bakiye
//		sorgulama cikis icin c ye basiniz diger durumlarda devam etsin
		
		char islem;
		do {
			System.out.println("Para cekme icin 1 para yatirmak icin 2 "
					+ "bakiye sormak icin 3 cikis icin c yi tiklayiniz");
			islem=scan.next().charAt(0);
			switch (islem) {
			case '1':paraCekme();
				break;
			case '2':paraYatirma();
			break;
			case '3':bakiyeSorma();
			break;
			case 'c':cikis();
			break;
			default:
				System.out.println("yalnis bir deger girdiniz");
				break;
			}
		} while (islem!='c');
		
	}

	private static void cikis() {
	
		System.out.println("cikis yapildi");
	}

	private static void bakiyeSorma() {
		// TODO Auto-generated method stub
		
		System.out.println(" hesabinizda "+balance+" kadar para mevcuttur");
	}

	private static void paraYatirma() {
		// TODO Auto-generated method stub
		
		System.out.println("Ne kadar yatirmak istiyorsunuz");
		int yatirilanPara=scan.nextInt();
		balance+=yatirilanPara;
		System.out.println("hesabiniza "+yatirilanPara+" kadar para yatirildi  toplam bakiye"+balance);
	}

	private static void paraCekme() {
		// TODO Auto-generated method stub
		
		System.out.println("Ne kadar para cekmek istiyorsunuz");
		int cekilenPara=scan.nextInt();
		
		if(cekilenPara<=balance) {
			balance-=cekilenPara;
			System.out.println("hesabinizdan "+cekilenPara+ " kadar cekildi Toplam kalan"
					+ " miktar"+balance);
		}else {
			System.out.println("Hesabinizda bu kadar para yok");
		}
		
			
	}

}
