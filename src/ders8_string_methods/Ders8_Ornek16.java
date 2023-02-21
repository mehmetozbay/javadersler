package ders8_string_methods;

import java.util.Scanner;

public class Ders8_Ornek16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanici tarafindan bir email alin @ icerip ecermedigini control edin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir email adresi giriniz");
		String email = scan.nextLine();
		if (email.contains("@")) {
			System.out.println("Email gecerli");
		} else {
			System.out.println("Email gecersiz");
		}
	}

}
