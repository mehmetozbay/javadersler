package ders5;

import java.util.Scanner;

public class Ders5_Ornek8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir harf giriniz");
		char harf=scan.next().charAt(0);
		
		if(harf=='a') {
			System.out.println("ayse");
		}
		
		if(harf=='b') {
			System.out.println("Bilal");
		}
		
		scan.close();
	}

}
