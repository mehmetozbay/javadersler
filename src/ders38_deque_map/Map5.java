package ders38_deque_map;

import java.util.HashMap;
import java.util.Scanner;

public class Map5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//calisanlarin sadece maaslarini getirin
		HashMap<Integer, String> calisanlar=new HashMap<>();
		calisanlar.put(101, "Ali-1500");
		calisanlar.put(102, "Ahmet-2500");
		calisanlar.put(103, "Nergis-3500");
		
		for (String calisanBilgisi : calisanlar.values()) {
			String[] maas=calisanBilgisi.split("-");
//			System.out.println(maas[1]);
			//Maasi 1750 den buyuk olanlari yazdirin
			int maasBilgisi=Integer.parseInt(maas[1]);
			if (maasBilgisi>1750) {
				System.out.println(calisanBilgisi);
			}
		}
		
	}

}
