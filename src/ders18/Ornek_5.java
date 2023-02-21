package ders18;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullancidan 5 tane isim alip siralayiniz
		
		Scanner scan=new Scanner(System.in);
		String isimler[]=new String[5];
		for (int i = 0; i < isimler.length; i++) {
			
			System.out.println((i+1)+". ismi giriniz");
			isimler[i]=scan.nextLine();
		}
		
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
	}

}
