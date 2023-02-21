package test;

import java.util.Arrays;

public class Test_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int firstArr[][]= {{2,4},{3,4},{4,5}};
		int secondArr[][]= {{4,4},{5,4},{6,5}};
		int sonucArr[][]=new int[3][2];
		for (int i = 0; i < secondArr.length; i++) {
			for (int j = 0; j < secondArr[i].length; j++) {
				sonucArr[i][j]=firstArr[i][j]+secondArr[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(sonucArr));
	}

}
