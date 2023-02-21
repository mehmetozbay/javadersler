package ders11;

public class Ders11_Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Java Candir? 123";
		System.out.println(str.replaceAll("\\w", "*"));
		System.out.println(str.replaceAll("\\W", "-"));
		System.out.println(str.replaceAll("\\d", "-"));
		System.out.println(str.replaceAll("\\D", "-"));
		System.out.println(str.replaceAll("\\s", "-"));
		System.out.println(str.replaceAll("\\S", "-"));
		
	}

}
