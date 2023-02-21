package ders6;

import java.util.Scanner;

public class Ders6_Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullancidan bir sayi isteyiniz sayinin tek veya cift 
//		oldugunu yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		if(sayi%2==0) {
			System.out.println("sayi cift sayidir");
		}else {
			System.out.println("sayi tek sayidir");
		}

	}

}
