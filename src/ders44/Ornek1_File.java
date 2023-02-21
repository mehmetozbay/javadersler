package ders44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ornek1_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Files.lines(Paths.get("ogrenciler.txt")).forEach(t->System.out.println(t));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
