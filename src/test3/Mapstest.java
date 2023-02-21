package test3;

import java.util.HashMap;

public class Mapstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> arabaMap=new HashMap<>();
		arabaMap.put(101, "Opel, otomatik, 2016, siyah");
		arabaMap.put(102, "VW, manuel, 2018, beyaz");
	
		arabaMap.computeIfPresent(101, (key,value)->"Opel, otomatik, 2020, siyah");
		System.out.println(arabaMap);
		
	}

}
