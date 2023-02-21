package ders15;

import java.util.Scanner;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan bir cumle isteyin cumle uzunluguna kadar 0 dan baslayip 
//		sayilari yazdirin
//		ali can
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		int uzunluk = cumle.length();
		int i = 0;
		while (i < uzunluk) {
			i++;
			System.out.println(i);
		}
	}

}
