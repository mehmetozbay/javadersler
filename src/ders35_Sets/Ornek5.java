package ders35_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> isimler1=new HashSet<>(Arrays.asList("Ali", "Ahmet", "Sena", "Zeynep","Fuad","Tugrul"));
		
		System.out.println(isimler1.remove("Ali Can"));// Ali Can i sette arar bulamadigi icin false doner
		System.out.println(isimler1.remove("Ali"));// Ali yi sette arar ve bulur aliyi siler 
		System.out.println(isimler1); 
	}

}
