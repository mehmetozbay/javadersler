package ders17;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_5 {

	public static void main(String[] args) {
		
//		Kullanicidan 5 tane sayi alip Bunlari diziye atip yazdiralim
		
		Scanner scan=new Scanner(System.in);
		int sayilar[]= new int[5];
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i+1)+". sayiyi  giriniz");
			sayilar[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(sayilar));
		
	}
}
