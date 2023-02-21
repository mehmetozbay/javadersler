package ders39;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int arr[]= {1,2,4,6,8,10,10};
		
//		System.out.println(arr[2]);
//		System.out.println(arr[6]);
//		
		List<Integer> arr=Arrays.asList(1,2,4,6,8,10,0);
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr.get(i));
				System.out.println(arr.get(i)/arr.get(i+1));
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Sayi 0 a bolunmez");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Dizinin sinirini astiniz");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hata olustu");
		}
		
	}

}
