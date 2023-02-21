package ders20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan hayvan isimleri isteyin cikmak istiyor musunuz diye sorup e 
//		derse silmek istedigi ismi sorup
//		arraylistten silelim bu arraylisti yazdiralim
		 Scanner scan= new Scanner(System.in);
		 List<String> hayvanlar=new ArrayList<>();
		 char sec='h';
		 while (sec=='h') {
			System.out.println("Bir hayvan ismi giriniz");
			String isim=scan.nextLine();
			hayvanlar.add(isim);
			System.out.println("Cikmak istiyor musunuz (e,h)");
			sec=scan.next().charAt(0);
			scan.nextLine();
			 
		}
		 System.out.println(hayvanlar);
		 System.out.println("Hangi hayvani silmek istiyorsunuz");
		 String hayvanIsmi=scan.nextLine();
		 hayvanlar.remove(hayvanIsmi);
		 System.out.println(hayvanlar);
		
		
	}

}
