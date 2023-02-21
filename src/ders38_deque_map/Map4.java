package ders38_deque_map;

import java.util.HashMap;
import java.util.Scanner;

public class Map4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		HashMap<Integer, String> calisanlar=new HashMap<>();
		calisanlar.put(101, "Ali-1500");
		calisanlar.put(102, "Ahmet-2500");
		calisanlar.put(103, "Nergis-3500");
		
		System.out.println("Numara giriniz");
		int num=scan.nextInt();
		scan.nextLine();
		System.out.println("Isminizi giriniz");
		String ad=scan.nextLine();
		System.out.println("Maasinizi giriniz");
		int maas=scan.nextInt();
		if (calisanlar.containsKey(num)) {
			System.out.println("Bu numaraya ait kayit mevcuttur");
		}else {
			calisanlar.put(num, ad+"-"+maas);
		}
		System.out.println(calisanlar);
		
	}

}
