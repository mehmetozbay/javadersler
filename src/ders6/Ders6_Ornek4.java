package ders6;

import java.util.Scanner;

public class Ders6_Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan ucgenin kenar uzunluklarini girip 
//		eskenar olup olmadigini yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen ucgenin 3 kenarini giriniz");
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		int kenar3=scan.nextInt();
		
		if(kenar1==kenar2&&kenar2==kenar3) {
			System.out.println("eskenardir");
		}else {System.out.println("eskenar degildir");}
		
		
	}

}
