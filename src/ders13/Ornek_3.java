package ders13;

import java.util.Iterator;
import java.util.Scanner;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan bir sayi isteyin 0 dan baslayip istenen sayiya kadar olan sayilari yazdiran
//		kodu yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		for (int i = 0; i < sayi; i++) {
			System.out.println(i);
		}
	}

}
