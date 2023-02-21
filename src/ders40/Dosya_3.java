package ders40;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosya_3 {
	static Scanner scan=new Scanner(System.in);
	static File dosya = new File("ogrenciler.txt");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if (!dosya.exists()) {
				dosya.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		menu();
	}
	private static void menu() {
		boolean cikilsinMi=false;
		while (!cikilsinMi) {
			System.out.println("1-Dosyaya Ekleme\n"
					+ "2-Dosyadan Okuma\n3-Cikis");
			int sec=scan.nextInt();
			scan.nextLine();
			switch (sec) {
			case 1:
				dosyaEkle();
				break;
			case 2:
				dosyaOku();
				break;
			case 3:
				cikilsinMi=true;
				break;
			default:
				System.out.println("yalnis bir deger "
						+ "girdiniz");
				break;
			}
		}
	}

	private static void dosyaOku() {
		
		try {
			FileReader fReader=new FileReader(dosya);
			BufferedReader bReader=new BufferedReader(fReader);
			String satir;
			while((satir=bReader.readLine())!=null) {
				System.out.println(satir);
			}
			bReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void dosyaEkle() {
		try {
			FileWriter fWriter=new FileWriter(dosya,true);
			BufferedWriter bWriter=new BufferedWriter(fWriter);
			System.out.println("Adinizi giriniz");
			String ad=scan.nextLine();
			System.out.println("Soyadinizi giriniz");
			String soyad=scan.nextLine();
			System.out.println("Ders notunuzu giriniz");
			int not=scan.nextInt();
			scan.nextLine();
			bWriter.write(ad+"-"+soyad+"-"+not+"\n");
			bWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
