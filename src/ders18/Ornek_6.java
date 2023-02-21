package ders18;

import java.util.Scanner;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan 5 tane sayi alin cift olanlarin toplamini yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		int sayilar[]=new int[5];
		
		int toplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i+1)+". sayiyi giriniz");
			sayilar[i]=scan.nextInt();
			if (sayilar[i]%2==0) {
				toplam+=sayilar[i];
			}
		}
		
		
		System.out.println("Cift olanlarin toplami= "+toplam);
		
	}

}
