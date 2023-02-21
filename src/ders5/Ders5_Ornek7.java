package ders5;

import java.util.Scanner;

public class Ders5_Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		int yas=scan.nextInt();
		
		if(yas>=18) {
			System.out.println("yetiskin");
		}
		
		if(yas<18) {
			System.out.println("cocuk");
		}
	}

}
