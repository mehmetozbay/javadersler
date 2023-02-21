package ders34;

import java.util.LinkedList;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> isimler=new LinkedList<>();
		isimler.add("Ali");
		isimler.add("Can");
		isimler.add("Zeynep");
		isimler.add("Sena");
		isimler.add("Nergis");
		System.out.println("Silinmeden once" +isimler);
//		isimler.remove();//ilk elemani siler
		isimler.removeFirst();
		System.out.println("Ilk eleman daha hizli silindi Silindikten Sonra "+isimler);
		isimler.removeLast();
		System.out.println("Son eleman daha hizli silindi Silindikten Sonra "+isimler);
		
	}

}
