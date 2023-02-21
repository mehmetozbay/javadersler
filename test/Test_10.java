package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][]= {{2,3}, {4,5},{6,7},{7,8}};
		
		int myArray[][]=new int[4][4];
		
		myArray[0][2]=2;
		myArray[3][3]=3;
		
		
		
	 System.out.println(Arrays.toString(myArray[0]));
		
		
	 System.out.println(myArray[0][2]);
	 
	 for (int i = 0; i < myArray.length; i++) {
		for (int j = 0; j < myArray[i].length; j++) {
			System.out.println(myArray[i][j]+" ");
		}
	}
	 
	 System.out.println(Arrays.deepToString(myArray));
	 
	 Scanner scan=new Scanner(System.in);
	 
	 for (int i = 0; i < myArray.length; i++) {
		for (int j = 0; j < myArray[i].length; j++) {
			System.out.println("["+i+", "+j+"] elemani giriniz");
			myArray[i][j]=scan.nextInt();
		}
	}
	 
	 System.out.println(Arrays.deepToString(myArray));
	 
	 
	}

}
