package test5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		try {
//			File dosya = new File("C:\\Users\\mehme\\Desktop\\deneme\\test.txt");
//			if (!dosya.exists()) {
//				dosya.createNewFile();
//			}
//
//			FileWriter fWriter = new FileWriter(dosya, false);
//			BufferedWriter bwriter = new BufferedWriter(fWriter);
//			String deger = "Mehmet";
//			bwriter.write(deger);
//			bwriter.write("\nMehmet");
//			bwriter.write("\nAhmet");
//			bwriter.close();
//
//		} catch (Exception e) {
//			System.out.println("Dosyaya yazma sirasinda bir hata olustu");
//		}

		try {
			File dosya = new File("C:\\Users\\mehme\\Desktop\\deneme\\test.txt");

			FileReader fReader = new FileReader(dosya);
			BufferedReader bReader = new BufferedReader(fReader);
			String satir;
			while ((satir = bReader.readLine()) != null) {
				System.out.println(satir);
			}
			bReader.close();
		} catch (Exception e) {

			System.out.println("Dosya okuma sirasinda bir hata olustu");
		}
	}

}
