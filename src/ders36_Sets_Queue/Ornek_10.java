package ders36_Sets_Queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ornek_10 {
//Queue daki 5. elemani bulunuz
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> sayilar=new PriorityQueue<>(Arrays.asList(1,4,8,5,9,6,4,2));
		System.out.println(sayilar);
		Iterator<Integer> it=sayilar.iterator();
		int sayac=0;
		while (it.hasNext()) {
			Integer sayi =  it.next();
			sayac++;
			if(sayac==5) {
				System.out.println("5. eleman " +sayi);
			}
		}
	}
}
