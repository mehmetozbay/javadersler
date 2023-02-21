package ders16;

import java.util.Scanner;

public class Ornek_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int pin=1234
//		Kullanicidan bir pin kodu isteyiniz dogru girene kadar control ettiriniz
		Scanner scan=new Scanner(System.in);
		int pin=1234;
		int kod;
		
		do {
			System.out.println("Lutfen bir pin kodu giriniz");
			kod=scan.nextInt();
		} while (pin!=kod);
		System.out.println("Pin basarili");
	}

}
