package ders44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Ornek3 {

	public static void main(String[] args) {
//		icinde a harfi olan kelimeleri bulalim
		
		try {
			Files.lines(Paths.get("kitap.txt")).map(t->t.split(" ")).flatMap(Arrays::stream)
			.filter(t->t.contains("a")).forEach(t->System.out.println(t));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
