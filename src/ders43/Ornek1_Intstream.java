package ders43;

import java.util.stream.IntStream;

public class Ornek1_Intstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		IntStream.rangeClosed(1, 50).forEach(t->System.out.print(t+" "));
		
		
		int sonuc=IntStream.rangeClosed(1, 100).filter(t->t%2==1).sum();
		System.out.println(sonuc);
	}

}
