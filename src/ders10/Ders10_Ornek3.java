package ders10;

import java.util.Scanner;

public class Ders10_Ornek3 {

//	Kullanicidan istenilen 3 harfli bir kelimeyi tersten yazdirin
//	ali ila
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Kelimeyi giriniz");
		String word=scan.next();
		
		System.out.println("kelimenin tersten yazilmis hali "
		+ word.charAt(2)+""+word.charAt(1)+""+word.charAt(0));
	}

}
