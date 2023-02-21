package ders40;

import java.util.Scanner;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sifrenizi giriniz");
		String sifre=scan.nextLine();
		
		if (sifre.length()<8) {
			throw new InvalidPassException("Sifre 8 karakterden az olamaz");
		}
		else {
			System.out.println("Sifre islemleri basarili");
		}
		
	}

}
