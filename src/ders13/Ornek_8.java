package ders13;

import java.util.Scanner;

public class Ornek_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		7!=1*2*3*4*5*6*7;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Faktoriyeli alinacak sayiyi giriniz");
		int sayi=scan.nextInt();
		int carpim=1;
		for (int i = 1; i <= sayi; i++) {
			carpim=carpim*i;
		}
		System.out.println("sayinin faktoriyeli="+carpim);
	}

}
