package ders6;

import java.util.Scanner;

public class Ders6_Ornek10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println("Erkek icin e kadin icin k tiklayiniz");
		char cinsiyet = scan.next().charAt(0);
		if (cinsiyet == 'e') {
			if (yas > 65) {
				System.out.println("Erkek Emekli olabilir");
			} else {
				System.out.println("Erkek Emekli olamz");
			}
		} else if (cinsiyet == 'k') {
			if (yas > 60) {
				System.out.println("Kadin Emekli olabilirsiniz");
			} else {
				System.out.println("Kadin Emekli olamazsiniz");
			}
		}else {
			System.out.println("yalnis bir karakter girdiniz");
		}

	}

}
