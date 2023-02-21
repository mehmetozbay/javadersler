package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> isimler=Arrays.asList("Ahmet","Ali", "Can", "Yunus", "Sena");
//		Ismi A ile baslayanlardan sirasi ile ilkini atlayip digerlerini getiren kod
		
		isimler.stream().filter(t->t.charAt(0)=='A').sorted().skip(1).forEach(t->System.out.println(t));
		
	}

}
