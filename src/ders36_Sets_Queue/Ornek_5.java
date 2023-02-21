package ders36_Sets_Queue;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Ornek_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		retainAll=>Ortak elemanlar disindakileri siler
//		removeAll=>Ortak elemanlari siler
		Set<String> isimler=new TreeSet<>(Arrays.asList("Ali", "Ahmet", "Can"));
		Set<String> isimler1=new TreeSet<>(Arrays.asList("Ali", "Ahmet", "Huzeyfe"));
		System.out.println(isimler.retainAll(isimler1));
		System.out.println(isimler);
	}
}
