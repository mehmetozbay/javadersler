package ders32;

public class Ornek_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Girilen kelimeleri birlestiren sistemi yaziniz
		
		cumleYap("Ali", " eve ", "gel", " Ali ");
		
		
		
	}

	private static void cumleYap(String ilkKelime,String ikinciKelime, String ...kelimeler) {
		// TODO Auto-generated method stub
		System.out.println(ilkKelime);
		System.out.println(ikinciKelime);
		String cumle="";
		for (String kelime : kelimeler) {
			cumle+=kelime;
		}
		System.out.println(cumle);
	}

}
