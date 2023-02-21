package ders10;

import java.util.Scanner;

public class Ders10_Ornek9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bir email isteyin @gmail.com ile bitmis mi diye kontrol edin 

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir email giriniz");
		String email = scan.next();
		if (email.endsWith("@gmail.com")) {

			System.out.println("email gecerli");
		} else {
			System.out.println("Email gecersiz");
		}

	}

}
