package ders18;

import java.util.Arrays;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int myArr[]= {2,8,5,10,7};
		int cloneArray[]=myArr.clone();
		Arrays.sort(myArr);
		
		System.out.println(Arrays.toString(cloneArray));
		System.out.println(Arrays.toString(myArr));
//		2 5 7 8 10 
	}

}
