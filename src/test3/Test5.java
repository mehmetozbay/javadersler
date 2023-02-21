package test3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s2.length()>s1.length()?1:-1;
	}
}


public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<String>  p=new PriorityQueue<>(new MyComparator());
        
        p.offer("Can");
        p.offer("Hasan");
        p.offer("mehmet");
        p.offer("Aliasdsad");
        p.offer("Ahmet");
        System.out.println(p);
        while (!p.isEmpty()) {
            System.out.println(p.poll());
        }
      
	}

}
