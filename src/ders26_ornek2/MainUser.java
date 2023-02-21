package ders26_ornek2;

import java.util.Scanner;

public class MainUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		User classi olusturunuz Adi ve yasi olsun Kullanicinin adi nasil 
//		girilirse girilsin bas harfi
//		buyuk olarak set etsin. MainUser dan User olusturup calistiralim
		Scanner scan=new Scanner(System.in);
		User user =new User();
		System.out.println("Lutfen adinizi giriniz");
		String ad=scan.nextLine();
		user.setAdi(ad);
		System.out.println(user.toString());
		
	}

}
