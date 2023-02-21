package ders35_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ornek_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> isimler1=new HashSet<>(Arrays.asList("Ali", "Ahmet", "Sena", "Zeynep","Fuad","Tugrul"));
		Set<String> isimler2=new HashSet<>(Arrays.asList("Ali", "Ahmet", "Sena", "Zeynep","Fuad","Tugrul"));
		System.out.println(isimler1.equals(isimler2));
	}

}
