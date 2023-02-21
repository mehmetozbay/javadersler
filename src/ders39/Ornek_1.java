package ders39;

import java.util.Scanner;

public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		try {
			System.out.println("Bolunen sayiyi giriniz");
			int bolunen=scan.nextInt();
			System.out.println("Bolen sayiyi giriniz");
			int bolen=scan.nextInt();
			System.out.println("Sayilarin bolumu="+bolunen/bolen);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Bolen sayi 0 olamaz"+e.getMessage());
		}
		System.out.println("Merhaba");
	}

}
