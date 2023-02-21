package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Isimler listi olusturup bunu listeleyiniz
		
		List<String> isimler=Arrays.asList("Ahmet", "Can", "Yunus", "Sena");
		isimler.stream().forEach(t->System.out.print(" "+ t));
		
		
		
	}

}
