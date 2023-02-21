package ders14;


import java.util.Scanner;

public class Ornek_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan 5 tane sayi isteyip en buyugu ve
//		enkucugugunu yazdiriniz
//		10 4 5 12 3
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi=scan.nextInt();
		int enBuyuk=sayi;
		int enKucuk=sayi;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("sayi giriniz");
			 sayi=scan.nextInt();
			 if(sayi>enBuyuk) {
				 enBuyuk=sayi;
			 }
			 if(sayi<enKucuk) {
				 enKucuk=sayi;
			 }
		}
		System.out.println(" En buyuk sayi ="+enBuyuk+ " en kucuk sayi= "+enKucuk);
	}

}
