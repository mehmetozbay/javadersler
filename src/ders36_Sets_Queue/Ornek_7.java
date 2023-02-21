package ders36_Sets_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ornek_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<String> isimler=new PriorityQueue<>(Arrays.asList("Ahmet", "Zeynep", "Yunus", "Can"));
		System.out.println(isimler);
		
		Queue<String> isimler1=new LinkedList<>(Arrays.asList("Ahmet", "Zeynep", "Yunus", "Can"));
		System.out.println(isimler1);
		
	}

}
