package ders36_Sets_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s2.length()-s1.length();
	}
	
}

public class Ornek_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyComparator comp=new MyComparator();
		Queue<String> isimler= new PriorityQueue<>(comp);
		isimler.offer("Ali");
		isimler.offer("CanCan");
		isimler.offer("Hasan");
		
		while(!isimler.isEmpty()) {
			System.out.println(isimler.poll());
		}
		
		
		
	}

}
