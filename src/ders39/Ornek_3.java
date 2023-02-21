package ders39;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String isim="Ahmet";
			System.out.println(isim.length());
			isim="";
			System.out.println(isim.length());
			isim=null;
			System.out.println(isim.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
