package ders12;

import java.util.Scanner;

public class Ders12_Ornek15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Email control sistemi olusturunuz
//		@gmail.com icermeli
//		@gmail.com sonda olmali
//		Bosluk olmamali
//		islemini method olusturarak yapiniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen email giriniz");
		String email = scan.nextLine();
		emailKontrolEt(email);

	}

	private static void emailKontrolEt(String email) {
		// TODO Auto-generated method stub
		if (email.contains("@gmail.com") && email.endsWith("@gmail.com") && !email.contains(" ")) {
           System.out.println("email gecerli");
		}else {
			System.out.println("Email gecersiz");
		}
	}

}
