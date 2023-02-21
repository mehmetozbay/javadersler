package ders12;

import java.util.Scanner;

public class Ders12_Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		tekCiftBul(sayi);

	}

	private static void tekCiftBul(int sayi3) {
		// TODO Auto-generated method stub
		if (sayi3 % 2 == 0) {
			System.out.println("sayi cifttir");
		} else {
			System.out.println("sayi tektir");
		}
	}

}
