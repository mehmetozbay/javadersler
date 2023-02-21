package ders38_deque_map;

import java.util.HashMap;

public class Map3 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> arabaMap = new HashMap<>();
		arabaMap.put(100, "Opel-2015-Otomatik-C serisi-beyaz");
		arabaMap.put(101, "VW-2016-Manuel-Golf-siyah");
//		System.out.println(arabaMap);
		arabaMap.putIfAbsent(102, "Opel-2016-Otomatik-C serisi-beyaz");
		// key degeri mapde varsa bir sey yapmaz yoksa mape ekler
//		System.out.println(arabaMap);
		
		arabaMap.compute(100, (key, value)->"Opel-2019-Otomatik-C serisi-beyaz");
		
		System.out.println(arabaMap);
		arabaMap.computeIfAbsent(103, value->"Opel-2019-Otomatik-C serisi-siyah");
		System.out.println(arabaMap);
		arabaMap.computeIfPresent(103, (key,value)->"Opel-2019-Otomatik-D serisi-siyah");
		System.out.println(arabaMap);
		arabaMap.remove(100);
		System.out.println(arabaMap);
		
	}
}
