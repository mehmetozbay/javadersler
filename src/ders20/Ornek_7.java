package ders20;

import java.util.ArrayList;
import java.util.List;

public class Ornek_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> arr1=new ArrayList<>();
		List<String> arr2= new ArrayList<>();
		
		arr1.add("ali");
		System.out.println(arr1.equals(arr2));
		arr2.add("ali");
		System.out.println(arr1.equals(arr2));
	}

}
