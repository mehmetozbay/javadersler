package ders14;

import java.util.Scanner;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir String isteyin ve tersten yazdiriniz
//         0123456
//         ali eve
//		   eve ila
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		for (int i = cumle.length() - 1; i >= 0; i--) {
			System.out.print(cumle.charAt(i));
		}

	}

}
