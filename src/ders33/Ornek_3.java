package ders33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Renkler isminde bir List olusturup bir Iterator tanimlayip List elemanlari arasinda 
//		gezip elemanlari yazdiriniz
		
		String renk[]= {"mavi", "yesil", "kirmizi", "mor"};
		List<String> renkler=Arrays.asList(renk);
//		System.out.println(renkler);
		
//		renkler.add("mavi");
//		renkler.add("yesil");
//		renkler.add("turuncu");
		
		Iterator<String> renkList=renkler.iterator();
		while (renkList.hasNext()) {
			System.out.println(renkList.next());
		}
	}

}
