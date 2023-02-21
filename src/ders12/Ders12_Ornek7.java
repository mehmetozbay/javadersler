package ders12;

import java.util.Scanner;

public class Ders12_Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sonuc=tekCiftBul();
		System.out.println(sonuc);
	}
	private static String tekCiftBul() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		String sonuc;
		if(sayi%2==0) {
			return "Sayi cifttir";
		}else {
			return "Sayi tektir";
		}
	}

}
