package ders21;

import java.util.ArrayList;
import java.util.List;

public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myArr[]= {2,3,4,38,5};
		for (int each : myArr) {
			System.out.println(each);
		}
		List<String> isimler=new ArrayList<>();
		 
		isimler.add("Ali");
		isimler.add("hasan");
		isimler.add("Can");
		for (String each : isimler) {
			System.out.println(each);
		}
		
		
		
	}

}
