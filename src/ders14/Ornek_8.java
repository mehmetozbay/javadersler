package ders14;

import java.util.Scanner;

public class Ornek_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir sayi isteyiniz asal sayi olup olmadigini 
//		control ediniz
//		7 1 7
//		7 23456
//		16 234......15
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int sayac=0;
		for (int i = 2; i < sayi; i++) {
			if(sayi%i==0) {
				sayac++;
				System.out.println("sayac"+sayac+ " bolunen sayi"+i);
			}
		}
		if(sayi>1) {
		if(sayac!=0) {
			System.out.println("Sayi Asal degildir");
		}else {
			System.out.println("Sayi asaldir");
		}
		}else {
			System.out.println("yalnis sayi girdiniz");
		}
	}

}
