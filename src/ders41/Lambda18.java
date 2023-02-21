package ders41;

import java.util.Arrays;
import java.util.List;

public class Lambda18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sayilar = Arrays.asList(3, 10, 5, 15, 16, 5,-15,-20);
		sayilar.stream().sorted().skip(2).forEach(t->System.out.println(t));
	}

}
