package ders14;

import java.util.Scanner;

public class Ornek_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Kullanicidan bir cumle isteyip harleri 
// araya bosluk koyarak yazdiran kodu yaziniz
//		ali eve
//		a l i  e v e 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		String cumle=scan.nextLine();
		for (int i = 0; i < cumle.length(); i++) {
			System.out.print(cumle.charAt(i)+" ");
		}	
	}
}
