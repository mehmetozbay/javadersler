package ders5;

import java.util.Scanner;

public class Ders5_Ornek6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir tane sayi giriniz");
		
		int sayi=scan.nextInt();
		
		
//		sayi tek mi yoksa cift mi kontrolu
		
		if(sayi%2==0) {
			System.out.println("sayi cifttir");
		}
		
		if (sayi%2!=0) {
			System.out.println("sayi tektir");
		}
	}

}
