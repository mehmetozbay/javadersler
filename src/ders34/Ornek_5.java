package ders34;

import java.util.LinkedList;

public class Ornek_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LinkedList<String> isimler=new LinkedList<>();
		isimler.add("Ahmet");
		isimler.add("Yunus");
		System.out.println(isimler);
		isimler.addFirst("Can");
		System.out.println("Can en basa eklendi" +isimler);
		isimler.addLast("Sena");
		System.out.println("Sena en sona eklendi"+isimler);
	}

}
