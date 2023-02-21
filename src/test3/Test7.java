package test3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer> sayilar=new PriorityQueue<>(Arrays.asList(4,5,6,8,6,7));
        Iterator<Integer> it=sayilar.iterator();
        while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
