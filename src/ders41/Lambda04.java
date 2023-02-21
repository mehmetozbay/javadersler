package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Sayilar listindeki herbir elemani 3  ve 5 ile bolunenleri yazdiralim
		
		List<Integer> sayilar=Arrays.asList(1,10,5,15,16);
		
		sayilar.stream().filter(t->t%3==0&&t%5==0).forEach(t->System.out.println(t));
		
	}

}
