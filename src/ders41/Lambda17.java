package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		sayilarin pozitif olanlarinin en kucugunu getiriniz
		
		List<Integer> sayilar = Arrays.asList(3, 10, 5, 15, 16, 5,-15,-20);
		
		sayilar.stream().filter(t->t>0).sorted().limit(1).forEach(t->System.out.println(t));
	}

}
