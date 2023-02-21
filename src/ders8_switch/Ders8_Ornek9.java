package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir sayi isteyiniz ve bir secenek isteyiniz 1 icin sayinin karesi 2 icin
//		kupu 3 icin karekokunu aliniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();

		System.out.println("Lutfen bir  islem seciniz(sayinin karesi icin 1 kupu icin 2 karekoku ici 3 )");
		int sec = scan.nextInt();

		switch (sec) {
		case 1:
			System.out.println("sayinin karesi" + Math.pow(sayi, 2));
			break;
		case 2:
			System.out.println("sayinin kupu" + Math.pow(sayi, 3));
			break;
		case 3:
			System.out.println("sayinin kupu" + Math.sqrt(sayi));
			break;
		default:
			System.out.println("yalnis bir secenek tikladiniz");
			break;
		}

	}

}
