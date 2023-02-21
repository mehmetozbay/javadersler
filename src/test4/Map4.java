package test4;

import java.util.HashMap;

public class Map4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, HashMap<String, String>> calisanlar=new HashMap<>();
		HashMap<String, String> calisanBilgisi=new HashMap<>();
		calisanBilgisi.put("ad", "Ahmet");
		calisanBilgisi.put("soyad", "Can");
		calisanBilgisi.put("maas", "1500");
		calisanlar.put(1, calisanBilgisi);
		System.out.println(calisanlar);
		HashMap<String, String> calisanBilgisi2=new HashMap<>();
		calisanBilgisi2.put("ad", "Hasan");
		calisanBilgisi2.put("soyad", "Kaya");
		calisanBilgisi2.put("maas", "2500");
		calisanlar.put(2, calisanBilgisi2);
		System.out.println(calisanlar);
		System.out.println(calisanlar.get(1).get("ad"));
		
	}

}
