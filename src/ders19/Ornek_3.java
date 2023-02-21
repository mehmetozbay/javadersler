package ders19;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan 4x4 bir matris olusturmasi icin sayilar isteyiniz 
//		diziyi yazdirip elemanlarin
//		toplamini yazdiriniz
		
//		4 5 5 6
//		4 5 6 7
//		7 8 9 10 
//		1 2 3 4
		
		
		Scanner scan= new Scanner(System.in);
		int arr[][]=new int[4][4]; 
		int toplam=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				System.out.println(i+","+j+". elemani giriniz");
				arr[i][j]=scan.nextInt();
				toplam+=arr[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Toplam="+toplam);
	}

}
