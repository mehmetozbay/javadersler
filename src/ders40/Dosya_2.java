package ders40;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dosya_2 {
	
	public static void main(String[] args) {
		File dosya = new File("deneme.txt");
		try {
			FileReader fReader=new FileReader(dosya);
			BufferedReader bReader=new BufferedReader(fReader);
			String satir;
			List<String> ogrenciler=new ArrayList<>();
			List<String> isimler=new ArrayList<>();
			List<String> soyIsimler=new ArrayList<>();
			while ((satir=bReader.readLine())!=null) {
				System.out.println(satir);
				String kelime[]=satir.split(" ");
//				ogrenciler.add(satir);
				isimler.add(kelime[0]);
				soyIsimler.add(kelime[1]);
			}
			System.out.println("1. ogrencin Adi "+isimler.get(0));
			System.out.println("1. ogrencin Soyadi "+soyIsimler.get(0));
			bReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Dosya bulunamadi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Dosya okuma sirasinda bir hata olustu");
		}
		
		
	}
}
