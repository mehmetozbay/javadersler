package ders33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ornek_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> isimler=new ArrayList<>();
		isimler.add("Ahmet");   
		isimler.add("Can");
		isimler.add("Hasan");
		isimler.add("Zeynep");
		isimler.add("Sena"); 
		isimler.add("Nergis");
		
		Iterator<String> isimList=isimler.iterator();
		while (isimList.hasNext()) {
		
			if (isimList.next()=="Hasan") {
				isimList.remove();
			}
		}
		System.out.println(isimler);
		
	}

}
