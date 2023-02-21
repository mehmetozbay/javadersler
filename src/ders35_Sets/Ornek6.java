package ders35_Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ornek6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		6 tane renkten olusan bir Hashset olusturup kullanicidan bir tanesini silmesini isteyin ve 
//		o rengi hash setten silin
		
		Scanner scan= new Scanner(System.in);
		Set<String> renkler=new HashSet<>();
		
		for (int i = 0; i < 6; i++) {
			System.out.println((i+1)+". rengi giriniz");
			String renk=scan.nextLine();
			renkler.add(renk);
		}
		System.out.println("Renkler "+renkler);
		System.out.println("Hangi rengi silmek istiyorsunuz");
		String silinicekRenk=scan.nextLine();
		
		if (renkler.contains(silinicekRenk)) {
			System.out.println("Silinecek olan Renk bulundu ve Silindi");
			renkler.remove(silinicekRenk);
			System.out.println("Renkler "+renkler);
		} else {
             System.out.println("Girdiginiz renk renkler arasinda bulunmamaktadir"); 
		}
	}

}
