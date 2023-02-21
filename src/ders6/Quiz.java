package ders6;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen A degeri icin ilk sayiyi B degeri icin ikinci sayiyi giriniz");

		double nr = scan.nextDouble();

		double nr2 = scan.nextDouble();
		int ab = (int) Math.pow(nr, nr2);

		double sonuc = (ab + (nr + 5) * 4);

		double sonuc2 = (double) Math.sqrt(sonuc);

		System.out.println("Sonuc =" + sonuc2);
	}

}
