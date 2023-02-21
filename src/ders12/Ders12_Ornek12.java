package ders12;

import java.util.Scanner;

public class Ders12_Ornek12 {
//	Kullanicidan bir Cumle isteyin method kullanarak son kelimesini yazdirin
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		sonKelimeYazdir(cumle);

	}

	private static void sonKelimeYazdir(String cumle) {
		// TODO Auto-generated method stub
//             ali eve gel
		int boslukIndexNo=cumle.lastIndexOf(" ");
		System.out.println(cumle.substring(boslukIndexNo+1));
	}

}
