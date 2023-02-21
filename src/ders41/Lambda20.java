package ders41;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> isimler = Arrays.asList("Ahmet", "Ali", "Can", "Yunus", "Sena");
		String sonuc = isimler.stream().sorted().findFirst().get();
		System.out.println(sonuc);
		
		
	}

}
