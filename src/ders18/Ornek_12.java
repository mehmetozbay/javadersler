package ders18;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Kullanicinin girmek istedigi kadar int array olusturup 
//	en buyugu ve en kucugu arasindaki
//	farki bulunuz
		Scanner scan=new Scanner(System.in);
		System.out.println(" Kac tane sayi girmek istersiniz");
		int sayi=scan.nextInt();
		int sayilar[]=new int[sayi];
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i+1)+". sayiyi giriniz");
			sayilar[i]=scan.nextInt();
		}
		
		Arrays.sort(sayilar);
		System.out.println("En buyuk sayi ile en kucuk sayi arasindaki fark= "
		+(sayilar[sayilar.length-1]-sayilar[0]));
	}

}
