package ders10;

import java.util.Scanner;

public class Ders10_Ornek18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan isim isteyin Ilk harfi buyuk digerleri kucuk yazdirin
		
//		ahmet Ahmet
//		AHMET A 
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir isim girniz");
		String isim=scan.nextLine();
		System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase());
	}

}
