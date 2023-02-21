package ders7;

import java.util.Scanner;

public class Ders7_Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan=new Scanner(System.in);
//		System.out.println("Lutfen bir sayi giriniz");
//		int sayi=scan.nextInt();
//		
//		String sonuc=sayi%2==0?"Cift Sayi":"Tek Sayi";
//		System.out.println(sonuc);
		
//		int x=10;
//		System.out.println(x>2?"Ahmet":"Mehmet");
		
		int x=10;
		int y=12;
		int a=(x<5)?(x++):(y++);
		int b=(y<15)?(++y):(++x);
		System.out.println(x+" "+y+" "+a+" "+b);
	}

}
