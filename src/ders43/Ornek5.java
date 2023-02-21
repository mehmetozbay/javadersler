package ders43;

import java.util.stream.IntStream;

public class Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sonuc=IntStream.iterate(100, t->t+2).limit(1500).sum();
		System.out.println(sonuc);
	}

}
