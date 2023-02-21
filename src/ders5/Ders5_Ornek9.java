package ders5;

import java.util.Scanner;

public class Ders5_Ornek9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ilk sayiyi giriniz");
		int say1=scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int say2=scan.nextInt();
		
		if(say1>say2) {
			System.out.println("Ilk sayi daha buyuktur");
		}
		if (say2>say1) {
			System.out.println("Ikinci sayi daha buyuktur");
		}
		
		if (say2==say1) {
			System.out.println("her iki sayi da esittir");
		}
	}

}
