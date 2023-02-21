package ders32;

public class Ornek_1_Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		topla(2,3);
		topla2(2,4,6);
		topla2(2,4,6,12,15,18,25,25,45,15,42);
		
	}

	private static void topla2(int ...sayi) {
	  int	toplam=0;
	 for (int i : sayi) {
		toplam+=i;
		System.out.println(i);
	}
		System.out.println("toplam "+toplam);
	}

	public static void topla(int a, int b) {
		System.out.println("sayilarin toplami "+(a+b));
	}
}
