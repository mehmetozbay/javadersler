package test4;

import java.util.HashMap;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "ali-Celik-1000");
		myMap.put(2, "can-Canan-2000");
		myMap.put(3, "hasan-Yilmaz-2500");
		for (String each : myMap.values()) {
			String soyIsim[]=each.split("-");
			System.out.println(soyIsim[1]);
		}
	}
}
