package ders39;

import java.util.Scanner;

public class Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean islem = false;
		Scanner scan = new Scanner(System.in);
		while (!islem) {
			try {
				System.out.println("Lutfen bir sayi giriniz");
				String sayi1 = scan.nextLine();
				int yeniSayi1 = Integer.parseInt(sayi1);
				System.out.println("Ikinci sayiyi giriniz");
				String sayi2 = scan.nextLine();
				int yeniSayi2 = Integer.parseInt(sayi2);
				System.out.println("sayilarin carpimi=" + yeniSayi1 * yeniSayi2);
				islem = true;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Lutfen rakam giriniz");
				islem = false;
			}
		}

	}

}
