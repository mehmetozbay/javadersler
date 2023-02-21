package ders14;

import java.util.Scanner;

public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanıcıdan bır cumle isteyiniz cumle icindeki a 
//		larin sayisini bulunuz
//		012345678910
//		ali ata bin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		String cumle=scan.nextLine();
		int sayac=0;
		for (int i = 0; i <= cumle.length()-1; i++) {
			if(cumle.charAt(i)=='a') {
				sayac++;
			}
		}
		System.out.println(" toplam a larin sayisi "+sayac);
	}

}
