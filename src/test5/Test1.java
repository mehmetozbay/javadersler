package test5;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bolunen sayiyi giriniz");
		int a=scan.nextInt();
		System.out.println("Bolen sayiyi giriniz");
		int b =scan.nextInt();
		try {
			System.out.println("Sayilarin bolumu="+a/b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage()+"Bolen sayi 0 olamaz");
		}finally {
			System.out.println("baglanti sonlandi");
		}
		
	}
}
