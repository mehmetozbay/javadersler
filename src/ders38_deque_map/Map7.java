package ders38_deque_map;

import java.util.HashMap;

public class Map7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, HashMap<String, String>> calisanlar=new HashMap<>();
		
		HashMap<String, String> calisanBilgileri=new HashMap<>();
		calisanBilgileri.put("ad", "Ali");
		calisanBilgileri.put("maas", "2500");
		System.out.println(calisanBilgileri);
		calisanlar.put(1, calisanBilgileri);
		System.out.println(calisanlar);
		HashMap<String, String> calisanBilgileri2=new HashMap<>();
		calisanBilgileri2.put("ad", "Zeynep");
		calisanBilgileri2.put("maas", "3500");
		System.out.println(calisanBilgileri2);
		calisanlar.put(2, calisanBilgileri2);
		System.out.println(calisanlar);
		System.out.println(calisanlar.get(2).get("maas"));
		System.out.println(calisanlar.get(1).get("ad"));
	}

}
