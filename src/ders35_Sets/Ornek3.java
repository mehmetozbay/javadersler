package ders35_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> isimler1=new HashSet<>(Arrays.asList("Ali", "Ahmet", "Sena", "Zeynep","Fuad","Tugrul"));
		Set<String> isimler2=new HashSet<>(Arrays.asList("Huzeyfe", "Zeynep", "Nergis", "Zafer", "Yunus", "Ali", "Sena Nur"));
		
		
		isimler1.addAll(isimler2);
		System.out.println(isimler1);
		isimler1.clear();
		System.out.println(isimler1);
		
	}

}
