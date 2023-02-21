package test5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dosya = new File("sinif.txt");
		Scanner scan = new Scanner(System.in);
		try {

			if (!dosya.exists()) {
				dosya.createNewFile();
			}
			System.out.println("Yazmak icin 1 Okumak icin 2 yi tiklayiniz");
			int sec = scan.nextInt();
			scan.nextLine();
			if (sec == 1) {
				FileWriter fWriter = new FileWriter(dosya, true);
				BufferedWriter bWriter = new BufferedWriter(fWriter);
				char cikilsinMi = 'h';
				while (cikilsinMi == 'h') {
					System.out.println("Bir isim giriniz");
					String isim = scan.nextLine();
					
					System.out.println("Bir not giriniz");
					String not = scan.nextLine();
					bWriter.write(isim+"-"+not+"\n");
					System.out.println("Cikilsin mi");
					cikilsinMi = scan.next().charAt(0);
					scan.nextLine();
				}
				bWriter.close();
			}else {
				FileReader fileReader=new FileReader(dosya);
				BufferedReader bReader=new BufferedReader(fileReader);
				HashMap<Integer, HashMap<String,String>> ogrenciler=new HashMap<>();
				HashMap<String, String> ogrenciBilgileri=new HashMap<>();
				String ogrenci;
				int i=0;
				while((ogrenci=bReader.readLine())!=null) {
					String bilgiler[]=ogrenci.split("-");
					ogrenciBilgileri.put("adSoyad",bilgiler[0]);
					ogrenciBilgileri.put("not",bilgiler[1] );
					ogrenciler.put(i,ogrenciBilgileri);
					i++;
					
//					System.out.println(ogrenci);
				}
				bReader.close();
				
				for (HashMap<String, String> ogrenciBilgi :ogrenciler.values()) {
					System.out.println("Ad Soyad="+ogrenciBilgi.get("adSoyad"));
				
					System.out.println("Not="+ogrenciBilgi.get("not"));
					
				}
				
				
				
				 
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Dosya okuma sirasinda bir hata olustu");
		}
	}

}
