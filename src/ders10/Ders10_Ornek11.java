package ders10;

import java.util.Scanner;

public class Ders10_Ornek11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Kullaniciya sifre girmesini isteyiniz bos gecmesini engelleyiniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		String sifre = scan.nextLine();
		
		if (sifre.isEmpty()) {
			System.out.println("sifre gecersiz");
		} else {
			System.out.println("Sifre gecerli");
		}
	}

}
