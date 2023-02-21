package ders17;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan 5 tane sayi alip bunlarin diziye atip toplamini bulalim
		
		Scanner scan=new Scanner(System.in);
		int sayilar[]=new int[5];
		int toplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i+1)+". sayiyi giriniz");
			sayilar[i]=scan.nextInt();
			toplam+=sayilar[i];
		}
		
		System.out.println(Arrays.toString(sayilar));
		System.out.println("Toplam= "+toplam);
		
	}

}
