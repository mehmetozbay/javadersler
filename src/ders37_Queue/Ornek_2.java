package ders37_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Kisi{
	
	private String ad;
	private int yas;
	
	public Kisi() {
		// TODO Auto-generated constructor stub
	}

	public Kisi(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Kisi [ad=" + ad + ", yas=" + yas + "]";
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}

class MyComparators implements Comparator<Kisi>{

	@Override
	public int compare(Kisi k1, Kisi k2) {
		// TODO Auto-generated method stub
		return k2.getYas()-k1.getYas();
	}
	
}


public class Ornek_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kisi kisi1 =new Kisi("Can", 22);
		Kisi kisi2=new Kisi("Ali", 34);
		Kisi kisi3=new Kisi("Kaya", 42);
		
		Queue<Kisi> kisiler= new PriorityQueue<>(new MyComparators());
		
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		
		for (int i = kisiler.size(); i > 0; i--) {
			System.out.println(kisiler.poll());
		}
//		while (!kisiler.isEmpty()) {
//			System.out.println(kisiler.poll());
//		}
	}
}
