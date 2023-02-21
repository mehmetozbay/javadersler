package ders12;

import java.util.Scanner;

public class Ders12_Ornek11 {
//	Kullanicidan bir sayi isteyiniz 1000 den buyuk ise birler basamagindaki sayiyi
//	yazdiran program method kullanarak yaziniz
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Lutfen sayi giriniz");
      int say=scan.nextInt();
      birlerBasamakBul(say);
		
	}

private static void birlerBasamakBul(int say) {
	// TODO Auto-generated method stub
	
	if(say>=1000) {
		System.out.println("sayinin birler basamagi"+(say%10));
	}else {
		System.out.println("sayi 1000 den kucuktur");
	}
	
}

}
