package ders11;

import java.util.Scanner;

public class Ders11_Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("gunun bas harfini giriniz");
		String harf=scan.next();
		harf=harf.toUpperCase();
		System.out.println(harf);
		if(harf.equals("P")) {
			System.out.println("Pazartesi Persembe pazar");
		}
	}

}
