package ders13;

import java.util.Scanner;

public class Ornek_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir sayi isteyin istenen sayiya kadar 
//		olan sayilarin toplamini yazan kodu
//		yaziniz
		
//		5 0+1+2+3+4
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		int toplam=0;
		for (int i = 0; i < sayi; i++) {
			toplam=toplam+i;
			
		}
		System.out.println(toplam);
		
	}

}
