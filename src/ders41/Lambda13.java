package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		siralama yapiniz
		List<String> isimler=Arrays.asList("Ahmet", "Can", "Yunus", "Sena");
		
		isimler.stream().sorted().forEach(t->System.out.println(t));
		
	}

}
