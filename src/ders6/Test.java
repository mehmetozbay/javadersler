package ders6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kullancıdan bir harf girmesini isteyiniz");
		char harf=scan.next().charAt(0);
		
		if(harf>='a'&&harf<='z') {
			System.out.println("harf girdiniz");
		}
	}

}
