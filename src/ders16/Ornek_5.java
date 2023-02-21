package ders16;

import java.util.Scanner;

public class Ornek_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan toplamak uzere sayilar isteyin cikis yapmasi icin
//		0 a basmasini isteyin
//		Sonucta kac tane sayi ve toplamini yaziniz.
		Scanner scan=new Scanner(System.in);
		int sayi,sayac=0, toplam=0;
		do {
			System.out.println("Bir sayi giriniz cikis icin 0 giriniz");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		} while (sayi!=0);
		System.out.println("Cikis yaptiniz Girilen sayilarin toplami= "+toplam+" sayisi= "+(sayac-1));
	
	}

}
