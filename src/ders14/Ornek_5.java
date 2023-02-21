package ders14;

import java.util.Scanner;

public class Ornek_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Kullanicidan bir harf iste a dan baslayarak istenilen harfe 
//		kadar yazdiran kodu yaziniz
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char harf=scan.next().charAt(0);
		for (char i = 'a'; i <=harf; i++) {
			System.out.print(i+" ");
		}
		
	}

}
