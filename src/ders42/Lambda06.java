package ders42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> sayilar = Arrays.asList(4, 6, 10, 9, 8, -5, -8);

		List<Integer> ciftSayilar = sayilar.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
		System.out.println(ciftSayilar);

	}

}
