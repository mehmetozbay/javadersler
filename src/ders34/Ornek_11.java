package ders34;

import java.util.Arrays;
import java.util.LinkedList;

public class Ornek_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> isimler=new LinkedList<>();
		isimler.add("Ali");
		isimler.add("Can");
		isimler.add("Zeynep");
		isimler.add("Sena");
		isimler.add("Nergis");
		LinkedList<String> isimler2=new LinkedList<>(Arrays.asList("Tugrul", "Hasan"));
		
		isimler.addAll(isimler2);
		
		System.out.println("Isimlere isimler2 eklendi "+isimler);
		System.out.println("Isimlerin icerisinde isimler2 var mi diye kontrol edildi "+isimler.containsAll(isimler2));
//		System.out.println(isimler.contains("Can"));
		System.out.println("2. index teki elemani getirdik "+isimler.get(2));
		
	}

}
