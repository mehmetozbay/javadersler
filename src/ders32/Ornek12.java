package ders32;

import java.time.LocalTime;

public class Ornek12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder();
		
	  LocalTime zaman=LocalTime.now();
	  
	  System.out.println(zaman);
	  
	  String kelime="";
	  for (int i = 0; i < 10000; i++) {
		  kelime=kelime+i;
		
	}
	  System.out.println(kelime);
	  System.out.println();
	  LocalTime zaman1=LocalTime.now();
	  System.out.println(zaman1);
	  for (int i = 0; i < 10000; i++) {
		 sb.append(i);
		}
	  System.out.println(sb);
	  System.out.println();
	  LocalTime zaman2=LocalTime.now();
	  System.out.println(zaman2);

	}

}
