package ders42;

import java.util.Arrays;
import java.util.List;

public class Lambda05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> isimler=Arrays.asList("Sena", "Ali", "Zeynep","Yunus", "Zafer");
		System.out.println("Kucuk harfle yazim");
		isimler.stream().map(String::toLowerCase).forEach(Methods::yazdir);
		System.out.println("\nBuyuk harfle yazim");
		isimler.stream().map(String::toUpperCase).forEach(Methods::yazdir);
		
		
	}

}
