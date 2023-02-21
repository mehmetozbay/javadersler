package ders41;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tersten siralama
		List<Integer> sayilar = Arrays.asList(1, 10, 5, 15, 16, 5);
		sayilar.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
		
	}

}
