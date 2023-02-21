package ders34;

import java.util.LinkedList;

public class Ornek_2_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		LinkedList<String> isimler=new LinkedList<>();
		isimler.add("Ayse");
		isimler.add("Can");
		isimler.add(1, "Sena");//index numarasina gore ekleme yapar 1 nolu indexe Sena yi ekledi
		System.out.println(isimler);
	

	}

}
