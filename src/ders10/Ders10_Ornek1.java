package ders10;

import java.util.Scanner;

public class Ders10_Ornek1 {
//	Kullanici tarafindan bir email alin @ icerip ecermedigini control edin
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Email adresinizi giriniz");
		String email=scan.next();
		if(email.contains("@")) {
			System.out.println("Email gecerli");
		}else {
			System.out.println("Email gecersiz");
		}
		
		
	}

}
