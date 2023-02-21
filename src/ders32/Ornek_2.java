package ders32;

public class Ornek_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sayilarin carpimini Varargs kullanarak yapiniz
		
		carp(2,3,5);
	}

	private static void carp(int ...sayi) {
		// TODO Auto-generated method stub
		int carpim=1;
		for (int i : sayi) {
			carpim*=i;
		}
		System.out.println("carpim= "+carpim);
	}

}
