package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> sayilar=Arrays.asList(1,10,5,15,16);
//		cift olanlarin kubunu alan programi yaziniz
		
		sayilar.stream().filter(t->t%2==0).map(t->t*t*t).forEach(t->System.out.println(t));
		
	}

}
