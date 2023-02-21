package ders34;

import java.util.LinkedList;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> renkler=new LinkedList<>();
		renkler.add("mavi");
		renkler.add("yesil");
		renkler.add("mor");
		renkler.add(2, "kirmizi");
		System.out.println(renkler);
//		mavi yesil kirmizi mor 
//		 0     1    2       3
	}

}
