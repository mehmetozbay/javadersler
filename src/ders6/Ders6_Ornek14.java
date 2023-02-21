package ders6;

import java.util.Scanner;

public class Ders6_Ornek14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Bir Pizza firmasina websitesi yapiyorsunuz 
//		 (Kullanicidan mesafe km ve siparis
//	      bedelini isteyiniz)
//		 -15km den daha fazla mesafa icin eve teslimat olmayacaktir
//	   -15km den az mesafelerde Musteri 20 liradan fazla sifaris vermis ise 
//	   teslimat bedeli
//	 alinmiyacaktir.
//	-20 liradan az siparis vermis ise 10 km ye kadar 2 lira, 
//	15 km ye kadar 3 lira teslimat bedeli
//				 olacaktir

		Scanner scan = new Scanner(System.in);
		System.out.println("Mesafeyi km olarak giriniz");
		int mesafe = scan.nextInt();
		System.out.println("Siparis bedelini giriniz");
		int ucret = scan.nextInt();
		if (mesafe < 15) {
			if (ucret >= 20) {
				System.out.println("Teslimat bedeli alinmayacaktir");
			} else {
				if (mesafe < 10) {
					System.out.println("ucret olarak 2 lira odemeniz gerekmekte");
				} else if (mesafe < 15) {
					System.out.println("ucret olarak 3 lira odemeniz gerekmekte");
				}
			}
		} else {
			System.out.println("km 15 km de daha fazla oldugu icin teslimat yapilmamaktadir");
		}

	}

}
