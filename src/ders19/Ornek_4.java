package ders19;

import java.util.Arrays;

public class Ornek_4 {
	
	public static void main(String[] args) {
		
		
//		{{1,2,3}, {4,5},{6,7}} dizisinin child dizisinin elemanlari 
//		toplanmini ayri bir dizide yazdiriniz
		
		int arr[][]={{1,2,3}, {4,5},{6,7}};
		int toplam[]= new int[3];
		int top;
		for (int i = 0; i < arr.length; i++) {
			top=0;
			for (int j = 0; j < arr[i].length; j++) {
				top+=arr[i][j];
			}
			toplam[i]=top;
		}
		System.out.println(Arrays.toString(toplam));
	}
}
