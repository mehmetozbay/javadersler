package ders34;

import java.util.LinkedList;

public class Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> isimler=new LinkedList<>();
		isimler.add("Ali");
		isimler.add("Can");
		isimler.add("Zeynep");
		isimler.add("Sena");
		isimler.add("Nergis");
		isimler.remove(2);
		
		System.out.println("2 nolu index teki eleman silindi Yeni durumda isimler"+isimler);
		isimler.remove("Nergis");
		System.out.println("Nergisi isimlerden sildik "+isimler);
	}

}
