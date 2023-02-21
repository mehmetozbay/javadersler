package ders9;

import java.util.Scanner;

public class ders9_Ornek6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String isim="Alk";
//		System.out.println(isim.toLowerCase());
		
//		Kullanicidan bir kelime isteyin son harfi b ise kelimeyi buyuk yazdirin 
//		k ise kucuk yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen kelime giriniz");
		String kelime=scan.nextLine();
		
		int uzunluk=kelime.length();
		
//		char ilkHarf=kelime.charAt(0);
		char sonHarf=kelime.charAt(uzunluk-1);
		
		if(sonHarf=='b') {
			System.out.println("kelime buyuk harfe cevrildi "+kelime.toUpperCase());
		}else if(sonHarf=='k') {
			System.out.println("kelime kucuk harfe cevrildi "+kelime.toLowerCase());
		}
		else {
			System.out.println("kelimede degisiklik yapilmadi "+kelime);
		}
		
	}

}
