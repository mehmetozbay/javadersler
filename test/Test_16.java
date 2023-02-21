package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> sayilar=new ArrayList<>();
		
		Scanner scan=new Scanner(System.in);
	     char islem='e';
	     int sayi, toplam=0;
	     do {
			System.out.println("Lutfen toplanacak sayiyi giriniz");
			sayi=scan.nextInt();
			toplam+=sayi;
	    	 System.out.println("Devam etmek istiyor musunuz?");
	    	 islem=scan.next().charAt(0);
		} while (islem!='h');
		
		System.out.println("Sayilarin topklami = "+toplam);
	}

}
