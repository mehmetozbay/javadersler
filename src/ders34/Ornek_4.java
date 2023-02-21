package ders34;

import java.util.Arrays;
import java.util.LinkedList;

public class Ornek_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		                                                              0         1          2
		LinkedList<String> isimler=new LinkedList<>(Arrays.asList("Tugrul", "Zafer", "Huzeyfe"));
		System.out.println("isimler ilk hali  " +isimler);
		LinkedList<String> isimler2=new LinkedList<>(Arrays.asList("Ahmet", "Zeynep", "Nergis"));
		System.out.println("isimler2 en bas hali"+ isimler2);
//		isimler.addAll(isimler2);
//		isimler2.addAll(isimler);
		isimler.addAll(2, isimler2);
		System.out.println("isimlere isimler2 eklendi"+isimler);
	}

}
