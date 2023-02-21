package ders7;

import java.util.Scanner;

public class Ders7_Ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullaniciya yasini sorun eger 18 den buyukse yetiskin
//		yazdirin kucukse cocuk
//		yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("yasini  giriniz");
		int yas=scan.nextInt();
	String sonuc=	yas>18?"yetiskin":"cocuk";
		
		System.out.println(sonuc);
		
	}

}
