package ders43;

import java.util.stream.IntStream;

public class Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sonuc = IntStream.rangeClosed(1, 10).filter(t->t%2==0).reduce(1, Math::multiplyExact);
	    System.out.println(sonuc);
	}

}
