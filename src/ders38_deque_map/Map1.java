package ders38_deque_map;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> arabaMap=new HashMap<>();
		arabaMap.put(100, "Opel-2015-Otomatik-C serisi-beyaz");
		arabaMap.put(101, "VW-2016-Manuel-Golf-siyah");
		System.out.println(arabaMap);
		System.out.println(arabaMap.keySet());
		// keylerin listesini bize verir [100, 101]
		System.out.println(arabaMap.values());
		//Value larin degerini bize verir [Opel, 2015, Otomatik, C serisi, beyaz, VW, 2016, Manuel,Golf, siyah]
		arabaMap.put(102, "Bmw-2017-Manuel-1.18-siyah");
		//key map de varsa value degerlerini gunceller yoksa yeni ekler
		System.out.println(arabaMap);
		System.out.println(arabaMap.containsKey(108));
		//keyin olup olmadigini kontrol eder
		System.out.println(arabaMap.containsValue("Opel1-2015-Otomatik-C serisi-beyaz"));
		//value degerinin mapte olup olmadigini kontrol eder
		arabaMap.put(104, null);
		// map ler null degeri alabilir
		System.out.println(arabaMap);
		System.out.println(arabaMap.get(101));
		// key degerine gore value degerini dondurur VW-2016-Manuel-Golf-siyah
		System.out.println(arabaMap.get(108));
		// eger sistemde yoksa bu key null dondurur
		
		System.out.println(arabaMap.getOrDefault(101, "Eleman bulunamadi"));
		//101 oldugu icin value degerlerini getirir VW-2016-Manuel-Golf-siyah
	    System.out.println(arabaMap.getOrDefault(108, "bulunamadi"));
	    //108 keyi map de olmadigi icin default olarak bulunamdi yazar
	    System.out.println(arabaMap.size());
	    //map in uzunlugunu verir
	    HashMap<Integer, String> arabaMap1=new HashMap<>();
		arabaMap.put(105, "Opel-2015-Otomatik-C serisi-beyaz");
		arabaMap.put(106, "VW-2016-Manuel-Golf-siyah");
		//arabaMap1 map ini arabaMap icine ekledik
		arabaMap.putAll(arabaMap1);
		System.out.println(arabaMap);
	    
	    
	    
	}

}
