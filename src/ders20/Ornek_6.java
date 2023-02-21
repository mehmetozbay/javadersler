package ders20;

import java.util.ArrayList;
import java.util.List;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> hayvanlar=new ArrayList<>();
		hayvanlar.add("Kedi");
		hayvanlar.add("Kopek");
		hayvanlar.add("Inek");
		hayvanlar.add("Yilan");
		System.out.println(hayvanlar);
		hayvanlar.set(1, "Aslan");
		System.out.println(hayvanlar);
//		System.out.println(hayvanlar.isEmpty());
//		System.out.println(hayvanlar);
//		hayvanlar.clear();
//		System.out.println(hayvanlar);
//		System.out.println(hayvanlar.isEmpty());
	}

}
