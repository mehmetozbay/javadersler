package ders18;

import java.util.Arrays;

public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int myArray[]=new int[10];
//		            0 1 2
		int arr[]= {5,3,4};
		int boyut=arr.length;
		System.out.println(arr[boyut-1]);
//3 4 5
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
