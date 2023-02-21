package ders6;

import java.util.Scanner;

public class Ders6_Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan iki tane sinav notu bir tane sozlu notunu isteyip 
//		ortalamasini aliniz
//		Ortalama 50 den buyuk ise gectiniz degilse kaldiniz yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki yazili sinav notu bir sozlu notu giriniz");
		int sinav1=scan.nextInt();
		int sinav2=scan.nextInt();
		int sozlu=scan.nextInt();
		
		int ortalama=(sinav1+sinav2+sozlu)/3;
		
		if (ortalama>=50) {
			System.out.println("gectiniz");
		} else {
System.out.println("kaldiniz");
		}
		
		
	}

}
