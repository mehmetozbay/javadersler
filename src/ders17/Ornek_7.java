package ders17;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan 5 tane sayi alip bunlarin her birini diziye atip
//		2 artirip yazdiriniz 
		
		
		Scanner scan=new Scanner(System.in);
		int sayilar[]=new int[5];
		int toplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i+1)+". sayiyi giriniz");
			sayilar[i]=scan.nextInt()+2;
			
		}
		System.out.println(Arrays.toString(sayilar));
	}

}
