package ders8_string_methods;

import java.util.Scanner;

public class Ders8_Ornek12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String isim="Ali can";
//		System.out.println(isim.charAt(0));
		
//		String isim1="Ali";
//		String isim2="Ali";
//		System.out.println(isim1.equals(isim2));
		
//		String isim1="Ali";
//		String isim2="ali";
//		System.out.println(isim1.equalsIgnoreCase(isim2));
//		
		
		Scanner scan=new Scanner(System.in);
		String username="mehmet ahmet";
		String pass="M1234";
	
		System.out.println("Kullanici adi giriniz");
		String ad=scan.nextLine();
		System.out.println("Password giriniz");
		String sifre=scan.nextLine();
		
		if(username.equals(ad)&&pass.equals(sifre)) {
			System.out.println("Sisteme basarili bir sekilde giris yaptiniz");
		}else {
			System.out.println("Kullanici adi veya sifre hatali Lutfen tekrar deneyiniz");
		}
		
	}

}
