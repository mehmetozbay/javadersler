package test3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> isimler = new LinkedList<>();
		isimler.offer("Zafer");
		isimler.offer("Can");
		isimler.offer("Hasan");
		System.out.println(isimler.pollLast());
		System.out.println(isimler);
	}

}
