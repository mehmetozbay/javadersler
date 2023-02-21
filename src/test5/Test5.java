package test5;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen maasinizi giriniz");
		
		int maas=scan.nextInt();
		
		try {
			if(maas<0) {
				throw new IllegalArgumentException(); 
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Maas negatif olamaz");
		}
		
	}

}
