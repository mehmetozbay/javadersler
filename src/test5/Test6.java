package test5;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sifrenizi giriniz");
		String sifre=scan.nextLine();
		if (sifre.length()>8) {
			System.out.println(sifre);
		}else {
			throw new InvalidPassUncheckedException(sifre + " 8 karakterden uzun olmalidir");
		}
	}
}
