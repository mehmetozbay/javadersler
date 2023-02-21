package ders39;

public class Ornek_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sayi=6;
//		String isim=sayi; //CTE
		
		try {
			Object sayi=6;
			String str= (String) sayi;
		} catch (ClassCastException e) {
			System.out.println("String integer a casting yapamayiz");
		}
		
	}

}
