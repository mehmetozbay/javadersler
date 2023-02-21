package ders12;

import java.util.Scanner;

public class Ders12_Ornek2 {

//	SAyinin tek yada cift oldugunu yazdiran progam method kullanarak yazin
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayiTekCiftBul();
		
	}

private static void sayiTekCiftBul() {
	// TODO Auto-generated method stub
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Bir sayi giriniz");
	int sayi=scan.nextInt();
	if(sayi%2==0) {
		System.out.println("sayimiz cifttir");
	}else {
		System.out.println("Sayimiz tektir");
	}
	
}

}
