package test4;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer, String> myMap=new HashMap<>();
     
     myMap.put(1, "ali-1000");
     myMap.put(2, "can-2000");
     myMap.put(3, "hasan-2500");
     
     System.out.println(myMap);
     myMap.remove(1);
     Scanner scan=new Scanner(System.in);
     System.out.println("Lutfen bir numara giriniz");
     int id=scan.nextInt();
     scan.nextLine();
     
     System.out.println("Lutfen bir isim giriniz");
     String ad=scan.nextLine();
     System.out.println("Lutfen maasinizi giriniz");
     int maas=scan.nextInt();
     if (myMap.putIfAbsent(id, ad+"-"+maas)==null) {
    	 System.out.println("kisi basari ile eklenmistir");
		System.out.println(myMap);
	}else {
		System.out.println("Bu id zaten kullanilmaktadir");
	}
     
     
	}

}
