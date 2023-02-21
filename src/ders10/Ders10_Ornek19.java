package ders10;

import java.util.Scanner;

public class Ders10_Ornek19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Iki kelime alin karakter sayisi cift ise i
//		 kinci stringi birinci stringin ortasina
//		 yerlestirin
		
//		mehmet ali  mehalimet
		Scanner scan= new Scanner(System.in);
		System.out.println("Ilk kelimeyi girniz");
		String ilkKelime=scan.nextLine();
		System.out.println("Ikinci kelimeyi giriniz");
		String ikinciKelime=scan.nextLine();
		int uzunluk=ilkKelime.length();
		System.out.println(uzunluk);
		if(uzunluk%2==0) {
		System.out.println(ilkKelime.substring(0, uzunluk/2)+ikinciKelime+
				ilkKelime.substring(uzunluk/2));	
		}
	}

}
