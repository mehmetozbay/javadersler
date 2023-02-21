package ders9;

import java.util.Scanner;

public class ders9_Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Kullanicidan ismini vce sifresini iste
//		isim ali sifre 123 ise giris basarili degilse basarisiz
		
		Scanner scan=new Scanner(System.in);
		String username="ali";
		String pass="123";
//		a==b=>a.equals(b)
		System.out.println("Kullanici adi giriniz");
		String isim=scan.nextLine();
		System.out.println("password giriniz");
		String sifre=scan.nextLine();
		if(username.equals(isim)&&pass.equals(sifre)) {
			System.out.println("giris basarili");
		}else {
			System.out.println("giris basarisiz");
		}
	}
}
