package ders7;

import java.util.Scanner;

public class Ders7_Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan cinsiyetini ve yasini isteyiniz 
//		Kadin ise 65 den buyuk ise emekli
//		olabilirsiniz degilse emekli olamazsiniz 
//		Erkek(e) ise 70 yasindan buyuk ise emekli olabilir
//		degilse emekli olamaz

//		c=='e'?(y>70?"":""):(y>65?"":"")

		Scanner scan = new Scanner(System.in);
		System.out.println("Erkek icin e Kadin icin k giriniz");
		char cinsiyet=scan.next().charAt(0);
		System.out.println("Yasiniz giriniz");
		int yas=scan.nextInt();
		String sonuc=cinsiyet=='e'?(yas>70?"Beyefendi emekli olabilirsiniz":"Beyefendi Emekli olamazsiniz")
	   :(cinsiyet=='k'?(yas>65?"Hanimefenndi emekli olabilirsiniz":"Hanimefendi Emekli olamzsiniz"):
         ("yalnis bir deger girdiniz"));
		
		System.out.println(sonuc);

	}

}
