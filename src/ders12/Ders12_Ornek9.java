package ders12;

import java.util.Scanner;

public class Ders12_Ornek9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sayinin tek yada cift oldugunu bulunuz
		Scanner scan=new Scanner(System.in);
		System.out.println("sayiyi giriniz");
		int sayi=scan.nextInt();
		String sonuc=tekCiftBul(sayi);
		System.out.println(sonuc);
	}
	private static String tekCiftBul(int sayi) {
		// TODO Auto-generated method stub
		String sonuc;
		if(sayi%2==0) {
			sonuc="sayi cifttir";
		}
		else {
			sonuc="sayi tektir";
		}
		return sonuc;
	}

}
