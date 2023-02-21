package ders16;

import java.util.Scanner;

public class Ornek_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan bir sayi ve us isteyiniz ussunu aliniz 2x2x2
		
//		2^3>3 3-2-1-0
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen tabani giriniz");
		int taban =scan.nextInt();
		System.out.println("Ussu giriniz");
		int us=scan.nextInt();
		int sonuc=1;
		while (us!=0) {
			sonuc*=taban;
			us--;
		}
		
		System.out.println("sayinin ussu "+sonuc);
	}

}
