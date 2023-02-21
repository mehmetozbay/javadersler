package test;

import java.util.Arrays;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int[] myArray= new int[10];
//		 myArray[2]=5;
//		 myArray[3]=10;
		
//		String cumle ="Java cok guzel bir dildir.Ogrenmek icin cok calismak gerekir.";
//		String myArray[]=cumle.split("\\.");
//		System.out.println(Arrays.toString(myArray));

		
		int numbers[]= {1,2,3,7};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 5));
		
	}

}
