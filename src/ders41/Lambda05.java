package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> sayilar=Arrays.asList(1,10,5,15,16);
		sayilar.stream().map(t->t*t).forEach(t->System.out.println(t));
		System.out.println("*********************");
		sayilar.stream().map(t->t+5).forEach(t->System.out.println(t));
		
	}

}
