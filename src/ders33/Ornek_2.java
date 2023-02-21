package ders33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ornek_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ACHZSN
		List<String> isimler=new ArrayList<>();
		isimler.add("Ahmet");   
		isimler.add("Can");
		isimler.add("Hasan");
		isimler.add("Zeynep");
		isimler.add("Sena");
		isimler.add("Nergis");
		
		Iterator<String> gosterge=isimler.iterator();
		
	while (gosterge.hasNext()) {
		System.out.print(gosterge.next()+" ");
	}
	}
}
