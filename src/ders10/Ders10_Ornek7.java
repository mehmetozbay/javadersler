package ders10;

import java.util.Scanner;

public class Ders10_Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Kullanicidan bir Sife isteyelim A ile basliyorsa 
//		sifre gecerli diger turlu gecersiz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		String sifre=scan.nextLine();
		if(sifre.startsWith("A")) {
			System.out.println("sifre gecerli");
		}else {
			System.out.println("sifre gecersiz");
		}
		
		
	}

}
