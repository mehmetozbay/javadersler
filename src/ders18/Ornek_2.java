package ders18;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan 5 tane sayi isteyiniz bunlardan en buyugunu ve en kucugunu yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		
		int arr[]=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println((i+1)+". sayiyi girriniz");
			arr[i]=scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Dizinin en kucuk elemani "+arr[0]);
		System.out.println("Dizinin en buyuk elemani "+arr[arr.length-1]);
	}

}
