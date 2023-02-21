package ders19;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		int myArr[][]=new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("["+i+","+j+"] elemani giriniz");
				myArr[i][j]=scan.nextInt();
			}
		}
		
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				System.out.print(myArr[i][j]+" ");
			}
			System.out.println();
		}
		
//		System.out.println(Arrays.deepToString(myArr));
	}

}
