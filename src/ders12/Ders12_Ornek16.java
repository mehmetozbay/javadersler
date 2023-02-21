package ders12;

import java.util.Scanner;

public class Ders12_Ornek16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Bir alisveris sitesi yapiyorsunuz
//		 -1000 lira ustune %20 indirim
//		 -200 lira ustune kargo bedava
//		 200 liranin altinda ise kargo 20 lira
//		 Kullaniciya yaptigi alisveris miktarini sorup toplam tutari yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ne kadarlik alisveris yaptiniz");
		int tutar=scan.nextInt();
		hesapla(tutar);
		
		
	}

	private static void hesapla(int tutar) {
	
		if(tutar>=1000) {
			int indirim=tutar*20/100;
			System.out.println("Topam tutar"+(tutar-indirim));
		}else if(tutar>=200){
			System.out.println("Toplam tutar"+tutar);
		}else {
			System.out.println("20 lira kargo bedli ile birlikte toplam tutar"+(tutar+20));
		}
		
		
	}

}
