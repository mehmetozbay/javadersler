package ders18;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bir cumle alin ve cumlede kac kelime oldugunu yazdriniz
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));
		System.out.println("cumlede "+kelimeler.length+" tane kelime var");
	}
}
