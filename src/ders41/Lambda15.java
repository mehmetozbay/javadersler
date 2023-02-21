package ders41;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> isimler=Arrays.asList("Ahmet", "Can", "Yunus", "Sena");
		isimler.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));

	}

}
