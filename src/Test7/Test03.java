package Test7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Test03 {

	
	public static void main(String[] args) {
		
		try {
			Files.lines(Paths.get("ogrenciler.txt")).map(t->t.split("-"))
			.flatMap(Arrays::stream)
			.filter(t->t.contains("a"))
			.forEach(t->System.out.println(t));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
