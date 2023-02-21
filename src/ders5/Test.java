package ders5;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("iki sayi giriniz");
	int say1=scan.nextInt();
	int say2=scan.nextInt();
	
	System.out.println("Islem giriniz");
	char islem=scan.next().charAt(0);
	if(islem=='+') {
		System.out.println("sayilarin toplami= "+(say1+say2));
	}else if(islem=='*') {
		System.out.println("sayilarin carpimi "+(say1*say2));
	}
}
}
