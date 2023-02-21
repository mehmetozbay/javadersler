package test4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, List<String>> myMap=new HashMap<>();
		List<String> isimler1=Arrays.asList("Ahmet", "Hasan", "Can", "Sena");
		myMap.put("1-A", isimler1);
		List<String> isimler2=Arrays.asList("Sena", "Ali", "Zeynep", "Nergis");
		myMap.put("2-A", isimler2);
		System.out.println(myMap);
		
		for (List<String> liste : myMap.values()) {
			for (String  isim : liste) {
				if (isim.charAt(0)=='A') {
					System.out.println(isim);
				}
			}
		}
		
	}

}
