package ders43;

import java.util.stream.IntStream;

public class Ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//5x4x3x2x1=120
//		5! sayisini hesaplayiniz
	int sonuc=	IntStream.rangeClosed(1, 5).reduce(1,Math::multiplyExact );
		System.out.println(sonuc);
	}

}
