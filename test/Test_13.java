package test;

import java.util.Arrays;

public class Test_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int myArray[][]= {{1,2,3},{2,4},{3,5}};
		int arr[]= {0,0,0};
		
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				
//				if(j==0||j==myArray[i].length-1) {
					arr[i]+=myArray[i][j];
//				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
