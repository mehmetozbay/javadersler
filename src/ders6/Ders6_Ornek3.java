package ders6;

import java.util.Scanner;

public class Ders6_Ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullancidan bir harf iste a ise Ayse degilse 
//		bilemediniz yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir harf giriniz");
		char harf = scan.next().charAt(0);

		if (harf == 'a' || harf == 'A') {
			System.out.println("Ayse");
		} else {
			System.out.println("bilemediniz");
		}

	}

}
