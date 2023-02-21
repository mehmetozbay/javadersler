package ders10;

import java.util.Scanner;

public class Ders10_Ornek17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Kullanicidan ismini soyismini arada bir 
//		bosluk olacak sekilde aliniz Adini ve
//		 Soyadini ayri ayri yazdiriniz
		
//		Ahmet Oran
//		indexOf boslugun inxini bulurum
// 0 baslar bu idexe kadar yazdiririm bu ismidir
// index ten basalar sona kadar da soyismidir
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Adiniz ve soyadiniz giriniz");
		String adSoyad = scan.nextLine();
		int boslukIndexNo=adSoyad.indexOf(" ");
		
		System.out.println(boslukIndexNo);
		System.out.println("Adiniz "+adSoyad.substring(0,boslukIndexNo));
		System.out.println("Soyadiniz "+adSoyad.substring(boslukIndexNo+1));
		
	}

}
