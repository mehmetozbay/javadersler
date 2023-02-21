package ders6;

import java.util.Scanner;

public class Ders6_Ornek15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan iki sayi isteyip bu iki sayi arasinda bilgisayara 
//		random(rastgele) sayi
//		urettiren kodu yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz");
		int say1 = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int say2 = scan.nextInt();
//[5-10) arasinda 
		int sayi = (int) (Math.random() * (say2-say1+1)) +say1;
		System.out.println(sayi);

	} 

}
