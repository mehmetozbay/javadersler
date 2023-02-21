package test3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Kisi {
	String name;
	int yas;
	public Kisi() {
		// TODO Auto-generated constructor stub
	}
	public Kisi(String name, int yas) {
		super();
		this.name = name;
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Kisi [name=" + name + ", yas=" + yas + "]";
	}
}

class MyComparators implements Comparator<Kisi>
{
	@Override
	public int compare(Kisi k1, Kisi k2) {
		// TODO Auto-generated method stub
		return k1.yas<k2.yas?1:-1;
	}
}
public class Test6 {
	public static void main(String[] args) {
		Kisi k1=new Kisi("Ali",16);
		Kisi k2= new Kisi("Can", 25);
		Kisi k3=new Kisi("Nergis",17);
		
		Queue<Kisi> kisiler=new PriorityQueue<>(new MyComparators());
		kisiler.add(k1);
		kisiler.add(k2);
		kisiler.add(k3);
		while (!kisiler.isEmpty()) {
			System.out.println(kisiler.poll());
		}
	}
}
