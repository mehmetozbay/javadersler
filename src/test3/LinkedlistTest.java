package test3;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedlistTest {

	public static void main(String[] args) {

		LinkedList<String> isimler = new LinkedList<>();
		isimler.add("Ali");
		isimler.add("Can");
		isimler.add("Hasan");
		isimler.add("Can");
		System.out.println(isimler.get(2));
	}
}
