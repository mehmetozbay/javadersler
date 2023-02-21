package ders16;

import java.util.Scanner;

public class Ornek_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir sayi isteyin sayilarin rakamlari toplamini bulunuz
//		12336556
//	rakam=sayi%10
//		sayi=sayi/10;
//		toplam+=rakam
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int sondakiRakam, toplam=0;
		do {
			sondakiRakam=sayi%10;
			toplam+=sondakiRakam;
			sayi/=10;
		} while (sayi!=0);
		System.out.println("Sayinin rakamlari toplami="+toplam);
	}

}
