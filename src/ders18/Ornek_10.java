package ders18;

import java.util.Arrays;

public class Ornek_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,4,8,5};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 4));
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 9));
		
	}

}
