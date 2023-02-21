package ders6;

import java.util.Scanner;

public class Ders6_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Kullaniciya yasini sorun eger 18 den buyukse 
//		yetiskin yazdirin kucukse cocuk
//	yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		if(yas<18) {
			System.out.println("cocuk");
		}else {
			System.out.println("yetiskin");
		}
		
		
	}

}
