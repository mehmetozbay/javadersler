package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan haftanin kacinci gun oldugunu sorun ve gun ismini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen haftanin kacinci gunu olacagini giriniz ");
		int sayi=scan.nextInt();
		switch (sayi) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Lutfen 1 ile 7 arasinda bir sayi giriniz");
			break;
		}
		
	}

}
