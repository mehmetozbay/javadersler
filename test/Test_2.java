package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_2 {
 static Scanner scan=new Scanner(System.in);
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 char islem='h';
	 while (islem!='e') {
		 
		 System.out.println("Kitap eklemek icin 1 Kitap listelemek icin 2 tiklayiniz");
		 
		 int key=scan.nextInt();
		 scan.nextLine();
		 
		List<String> kitaplar = null;
		switch (key) {
		case 1:
		    kitaplar= kitapEkle();
			break;
		case 2:
			 kitapListele(kitaplar);
			break;
		case 3:
			 islem='e';
			break;
		default:
			break;
		}
	}
     
	}

	private static void kitapListele(List<String> kitaplar) {
		for (String each : kitaplar) {
			System.out.println(kitaplar);
		}
		
	}

	

	private static List<String> kitapEkle() {
		// TODO Auto-generated method stub
		List<String> kitaplar=new ArrayList<>();
		System.out.println("Eklemek istediginiz kitap ismini giriniz");
		String kitap=scan.nextLine();
		kitaplar.add(kitap);
		return kitaplar;
	}

}
