package ders13;

import java.util.Scanner;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
//		 Kullanicidan bir sayi isteyin 0 dan baslayip 
//		istenen sayiya kadar olan sayilardan
//		 3 un kati ise JAVA
//		 5 in kati ise CANDIR
//		 3 ve 5 in kati ise JAVA CANDIR yazdiran kodu yaziniz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			
			if(i%3==0&&i%5==0) {
				System.out.println("Java Candir");
			}else if(i%3==0) {
				System.out.println("java");
			}else if(i%5==0) {
				System.out.println("candir");
			}
		}
		
		
		
		
	}

}
