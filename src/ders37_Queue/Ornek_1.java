package ders37_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String isim1, String isim2) {
		// TODO Auto-generated method stub
		return isim1.length()>isim2.length()?1:-1;
	}
	
}



public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyComparator comp=new MyComparator();
		Queue<String> isimler=new PriorityQueue<>(comp);
		isimler.offer("Ahmet");
		isimler.offer("Sena");
		isimler.offer("Zeynep");
		isimler.offer("Huzeyfe");
		isimler.offer("Ali");
		System.out.println(isimler);
		
		while (!isimler.isEmpty()) {
			System.out.println(isimler.poll());
		}
		
		
	}

}
