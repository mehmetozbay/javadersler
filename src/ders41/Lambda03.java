package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> sayilar=Arrays.asList(1,10,5,15,16);
		
		sayilar.stream().filter(sayi -> sayi % 2 == 1).filter(sayi -> sayi > 3)
				.forEach(sayi -> System.out.println(sayi));

	}

}
