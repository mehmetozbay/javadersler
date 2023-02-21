package ders34;

import java.util.Arrays;
import java.util.LinkedList;

public class Ornek_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> isimler=new LinkedList<>();
		isimler.add("Ali");
		isimler.add("Can");
		isimler.add("Zeynep");
		isimler.add("Sena");
		isimler.add("Nergis");
		isimler.add("Can");
		isimler.add("Can");
		System.out.println("Ilk durumda isimler" +isimler);
		LinkedList<String> isimler2=new LinkedList<>(Arrays.asList("Tugrul", "Huzeyfe", "Ahmet", "Zafer", "Mehmet"));
		System.out.println("Ilk durumda isimler2 "+isimler2);
		isimler.addAll(isimler2);
		System.out.println("Isimlere isimler2 eklendi "+isimler);
		isimler.removeAll(isimler2);
		System.out.println("Isimlerden isimler2 silindi" +isimler);
		isimler.removeAll(isimler);
		System.out.println("Isimler tamamen silindi "+isimler);
	}

}
