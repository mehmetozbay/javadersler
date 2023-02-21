package ders9;

import java.util.Scanner;

public class ders9_Ornek8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullancidan sifre isteyiniz sifresinde enaz bir ozel karekter isteyiniz
//		% & . bu karakterlerden en az birini icermesi gerekmekte
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen bir sifre giriniz");
		String sifre = scan.nextLine();
		boolean iceriyorMu= sifre.contains("%")||sifre.contains("&")||sifre.contains(".");
		if (iceriyorMu) {
			System.out.println("sifre gecerli");
		}else {
			System.out.println("sifre gecersiz");
		}
	}

}
