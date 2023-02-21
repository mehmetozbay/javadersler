package ders40;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosya1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dosya = new File("deneme.txt");
		Scanner scan=new Scanner(System.in);

		try {
			if (!dosya.exists()) {// dosya mevcut mu diye arastiririz
				dosya.createNewFile();
			}
			
//			String isim = "Ali\n";
//			bWriter.write("Ahmet");
			char cikilsinMi='h';
			
			while(cikilsinMi=='h') {
				FileWriter fWriter = new FileWriter(dosya, true);
				BufferedWriter bWriter = new BufferedWriter(fWriter);
				System.out.println("Isminizi giriniz");
				String isim=scan.nextLine();
				System.out.println("Soyadiniz giriniz");
				String soyAd=scan.nextLine();
				bWriter.write(isim+" "+soyAd.toUpperCase()+"\n");
				System.out.println("Cikmak istiyor musunuz");
				cikilsinMi=scan.next().charAt(0);
				scan.nextLine();
				bWriter.close();
			}
			
			
			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // yeni

	}

}
