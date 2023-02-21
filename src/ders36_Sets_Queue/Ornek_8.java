package ders36_Sets_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ornek_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> isimler=new PriorityQueue<>();
		isimler.add("Ali");
		isimler.add("Zeynep");
		isimler.add("Nergis");
		System.out.println(isimler);
		System.out.println(isimler.peek());//peek methodu ilk elemani bize verir
		System.out.println(isimler.poll());//poll ilk elemani siler ve silinen elemani yazdirir
		System.out.println("Ilk eleman silindikten sonraki durum "+isimler);
		System.out.println(isimler.remove());
		System.out.println("remove komutu kullanildiktan sonraki durum "+isimler);
		
    	isimler.clear();// isimler Queue sini temizledik
     	System.out.println(isimler);// []
		System.out.println(isimler.poll());//null
		System.out.println(isimler);// []
//		System.out.println(isimler.remove());//Queue da eleman yoksa hata verir
		isimler.offer("Sena");
		System.out.println(isimler);
		
		
	}
}
