package ders11;

import java.util.Scanner;

public class Ders11_Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan bir email isteyin gmail iceriyorsa hotmail ile degistiri
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen email giriniz");
		String email=scan.nextLine();
		System.out.println(email.replace("gmail", "hotmail"));
	}

}
