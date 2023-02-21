package ders36_Sets_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ornek_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<String> renkler=new PriorityQueue<>();
		renkler.offer("Mavi");
		renkler.offer("Yesil");
		renkler.offer("Mor");
		System.out.println(renkler);
		System.out.println("Ilk renk"+renkler.peek());
		System.out.println("Ilk Silinen Renk "+renkler.poll());
		
	}

}
