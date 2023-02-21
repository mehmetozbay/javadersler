package ders11;

import java.util.Scanner;

public class Ders11_Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Kullanicidan ismini M*****
//		 Sifreyi : ****1111 seklinde yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz");
		String ad = scan.nextLine();
		System.out.println("Lutfen en az 8 karakterli Sifrenizi giriniz");
		String sifre=scan.nextLine();
//		ahmet				a		hmet				****
		String yeniAd=ad.charAt(0)+ad.substring(1).replaceAll("\\w", "*");
		System.out.println(yeniAd);
//	          -4 -3 -2 -1
//		ahmet12345   ahmet1  2345
//		01234
//		ahmet uzunluk=5 t nin indexi 4=> t ye ulasmak tnin indexi = uzunluk-1
		String yeniSifre=sifre.substring(0, sifre.length()-4).replaceAll("\\w", "*")
				+sifre.substring(sifre.length()-4);
		System.out.println(yeniSifre);
		
		
		
	}

}
