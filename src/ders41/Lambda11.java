package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Farkli olan cift sayilarin karelerinin toplamini bulunuz
		List<Integer> sayilar = Arrays.asList(1, 10, 5, 15, 16, 5);
		int sonuc = sayilar.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (x, y) -> x + y);
		System.out.println(sonuc);

	}

}
