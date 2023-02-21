package ders7;

import java.util.Scanner;

public class Ders7_Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir sayi girmesini isteyiniz sayi pozitifse, 
//		sayinin tek veya cift oldugunu
//		kontrol ediniz negatifse negatif bir sayi girdiniz yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		String sonuc=(sayi>0)?
				(sayi%2==0?"sayi pozitif cift sayidir":"sayi pozitif tek sayidir")
				:("sayi negatiftir");
		System.out.println(sonuc);
		
		
	}

}
