package ders6;

import java.util.Scanner;

public class Ders6_Ornek6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanici tarafindan girilen 100 luk not sistemini 
//		rakama ceviriniz
//		0-44=>1
//		45-54=>2
//		55-69=>3
//		69-84=>4
//		85-100=>5
		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu giriniz");

		int not = scan.nextInt();
//		70
		if(not>=0&&not<=44) {
			System.out.println("1");
		}else if(not>=45&& not<=54) {
			System.out.println("2");
		}else if(not>=55 && not<=69) {
			System.out.println("3");
		}else if(not>=70&& not<=84) {
			System.out.println("4");
		}else if(not>=85 && not<=100) {
			System.out.println("5");
		}else {
			System.out.println("gecersiz");
		}

	}

}
