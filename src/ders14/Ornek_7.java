package ders14;

import java.util.Scanner;

public class Ornek_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan bir sayi isteyin bu sayi ile 
//		bolunebilen sayilarin toplamini bulunuz
		
//		5 1 2 3 4 5
//		10 1 2 3 4 5 6 7 8 910
		
//		sayac+=i;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		int toplam=0;
		for (int i = 1; i <= sayi; i++) {
			if(sayi%i==0) {
				toplam+=i;
				System.out.println(i);
			}
		}
		System.out.println("tam bolenlerin toplami "+toplam);
	}

}
