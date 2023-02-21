package Test7;

import java.util.stream.IntStream;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int sonuc=	IntStream.iterate(100, t->t+2).limit(2).sum();
		System.out.println(sonuc);
	
		
	}

}
