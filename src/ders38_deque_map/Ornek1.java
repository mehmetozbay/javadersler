package ders38_deque_map;

import java.util.Deque;
import java.util.LinkedList;

public class Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> isimler=new LinkedList<>();
		isimler.offer("Can");
		isimler.offer("Hasan");
		isimler.offer("Ali");
		System.out.println(isimler.getFirst());// ilk elemani getirir.
		System.out.println(isimler.peekFirst());
		System.out.println(isimler.getLast());// son elemani getirir.
		System.out.println(isimler.peekLast());// son elemani getirir.
		System.out.println(" ilk eleman silindi "+isimler.pollFirst());
		System.out.println(" son eleman silindi "+isimler.pollLast());
	}
}
