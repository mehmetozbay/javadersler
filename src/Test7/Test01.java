package Test7;

import java.util.stream.IntStream;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int sonuc=	IntStream.rangeClosed(1, 100).filter(t->t%2==1).sum();
		
		System.out.println(sonuc);
	}

}
