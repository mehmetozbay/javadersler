package ders9;

public class ders9_Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String isim="Ali eve gel";
//		System.out.println(isim.contains("e"));
		boolean eVarMi=isim.contains("Ali");
		if(eVarMi) {
			System.out.println(" kelimenin icinde var");
		}else {
			System.out.println(" kelimein icinde yok");
		}
	}

}
