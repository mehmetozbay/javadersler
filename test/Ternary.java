package test;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz");
		int say1=scan.nextInt();
		int say2=scan.nextInt();
		int say3=scan.nextInt();
		
		String sonuc=(say1==say2)&&(say2==say3)?"sayilar esit":"sayilar esit degil";
		
		System.out.println(sonuc);
	}

}
