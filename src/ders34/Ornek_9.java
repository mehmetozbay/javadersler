package ders34;

import java.util.LinkedList;

public class Ornek_9 {

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
		System.out.println("Ilk durum "+isimler);
		isimler.removeFirstOccurrence("Can");
		System.out.println("Birden fazla Can var ilki silindi" +isimler);
		isimler.removeLastOccurrence("Can");
		System.out.println("Birden fazla Can var sonuncu silindi" +isimler);
		
		
		
	}

}
