package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Farkli olan cift elemanlarin karesini alan kodu yaziniz
		List<Integer> sayilar=Arrays.asList(1,10,5,15,16,10,15,5);
		
		sayilar.stream().distinct().filter(t->t%2==0).map(t->t*t).forEach(t->System.out.println(t));
		
		
	}

}
