package ders17;

public class Ornek_2 {

	public static void main(String[] args) {
		
		
//		4 Elemanli bir String dizisi olusturun her birrine bir isim atayin ve her bir ismi yazdirin
		
		String isimler[]=new String[4];
		String isimler2[]= {"Ahmet", "Ali", "Can", "Ayse"};
		System.out.println(isimler2[0]+" "+isimler2[1]+" "+isimler2[2]+" "+isimler2[3]);
		isimler[0]="Zeynep";
		isimler[1]="Ali";
		isimler[2]="Can";
		isimler[3]="Sena";
		System.out.println(isimler[0]+" "+isimler[1]+" "+isimler[2]+" "+isimler[3]);
		
	}
}
