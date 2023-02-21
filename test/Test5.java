package test;

public class Test5 {

	public static void main(String[] args) {
		int toplam=topla(2,3);
		double toplam1=topla(2.5,3.4);
		System.out.println(toplam +" "+toplam1);
	}

	private static void ekranaAdYaz(String ad) {
		System.out.println("Adiniz"+ad);
	}

	public static int  topla(int say1, int say2) {
	     
		return say1+say2;
	}
	public static double  topla(double say1, double say2) {
	     
		return say1+say2;
	}
	
	
}
