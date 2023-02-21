package ders6;

import java.util.Scanner;

public class Ders6_Ornek9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Kullanicidan 3 tane sayi girmesini isteyip 
//		 en buyugunu yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen uc sayi giriniz");
		
		int say1=scan.nextInt();
		int say2=scan.nextInt();
		int say3=scan.nextInt();
		
		if(say1>say2&&say1>say3) {
			System.out.println("En buyuk sayi= "+say1);
		}else if(say2>say1&&say2>say3) {
			System.out.println("En buyuk sayi="+say2);
		}else if(say3>say1&&say3>say2) {
			System.out.println("En buyuk sayi="+say3);
		}else {
			System.out.println("esit deger girdiniz");
		}	
		
	}

}
