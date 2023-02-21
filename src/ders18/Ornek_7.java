package ders18;

import java.util.Scanner;

public class Ornek_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan alinan 5 sayinin  ilk ve son elemaninin ayni olup olmadigina bakiniz
		Scanner scan=new Scanner(System.in);
		int sayilar[]=new int[5];
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i+1)+". sayiyi giriniz");
			sayilar[i]=scan.nextInt();
		}
		if (sayilar[0]==sayilar[sayilar.length-1]) {
			System.out.println("1. ve sonuncu sayilar esittir");
		}else {
			System.out.println("1. ve sonuncu sayilar farklidir");
		}
	}

}
