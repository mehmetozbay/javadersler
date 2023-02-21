package test5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dosya = new File("isimler.txt");
		Scanner scan=new Scanner(System.in);
		try {

			if (!dosya.exists()) {
				dosya.createNewFile();
			}
			FileWriter fWriter = new FileWriter(dosya,true);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			char cikilsinMi='h';
			while(cikilsinMi=='h') {
				System.out.println("Bir isim giriniz");
				String isim=scan.nextLine();
				bWriter.write("\n"+isim);
				System.out.println("Cikilsin mi");
				cikilsinMi=scan.next().charAt(0);
				scan.nextLine();
			}
			bWriter.close();
//=====================Dosya Okuma=============>
			
			
			FileReader fileReader=new FileReader(dosya);
			BufferedReader bReader=new BufferedReader(fileReader);
			List<String> isimler=new ArrayList<>();
			String isim;
			while((isim=bReader.readLine())!=null) {
				isimler.add(isim);
				System.out.println(isim);
			}
			System.out.println("isimlerden ikinncisi"+isimler.get(1));
			bReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
