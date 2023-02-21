package ders35_Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ornek_2 {
	
	
//Kullanicidan 5 tane sayin isteyin Bunlari Hashsete atin
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		Set<Integer> sayilar=new HashSet<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1)+". sayiyi giriniz");
			int sayi=scan.nextInt();
			sayilar.add(sayi);
		
		}
		System.out.println(sayilar);
	}

}
