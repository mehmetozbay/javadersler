package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sayilar=Arrays.asList(1,10,5,15,16,10,15,5);
		sayilar.stream().distinct().forEach(t->System.out.println(t));
		
		
	}

}
