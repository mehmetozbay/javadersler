package ders15;

import java.util.Scanner;

public class Ornek_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan bir sayi isteyin 0 dan baslayip o sayiya kadar olan cift sayilari yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int i=0;
//		sayi=12
//		       0<12
		while (i<sayi) {
			
			if (i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		
	}

}
