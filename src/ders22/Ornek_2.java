package ders22;

import java.util.Scanner;

public class Ornek_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz");
		int ilkSayi=scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int ikinciSayi=scan.nextInt();
		System.out.println("Islem giriniz");
		char islem=scan.next().charAt(0);
		HesapMakinasi hm=new HesapMakinasi(ilkSayi, ikinciSayi);
		switch (islem) {
		case '+':
			hm.topla();
			break;
		case '-':
			hm.cikar();
			break;
		case '/':
			hm.bol();
			break;
		case '*':
			hm.carp();
			break;
		default:
			break;
		}
		
	}

}
