package ders10;

import java.util.Scanner;

public class Ders10_Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir kelime isteyin a iceriyorsa a iceriyor b iceriyorsa 
//		b iceriyor 
//		 her ikisi de yoksa her ikisi yok  yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime =scan.next();
		if(kelime.contains("a")&&kelime.contains("b")) {
			System.out.println("her ikisini de iceriyor");
		}else if(kelime.contains("a")) {
			System.out.println("a iceriyor");
		}else if(kelime.contains("b")) {
			System.out.println("b iceriyor");
		}else {
			System.out.println("her ikisi de yok");
		}
		
		
		
		
	}

}
