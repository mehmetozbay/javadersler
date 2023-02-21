package ders41;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> sayilar = Arrays.asList(1, 10, 5, 15, 16, 5);
		
		sayilar.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(t->System.out.println(t));
		
		
	}

}
