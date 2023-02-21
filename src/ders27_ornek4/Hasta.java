package ders27_ornek4;

public class Hasta extends Person {
	String sikayet;
	String ilac;
	public Hasta() {
		// TODO Auto-generated constructor stub
	}
	public Hasta(String ad, String adres, int yas, String tel, String sikayet, String ilac) {
		super(ad, adres, yas, tel);
		this.sikayet = sikayet;
		this.ilac = ilac;
	}
	
	public void faturaOde() {
		System.out.println(ad+"faturayi odedi");
	}
	public void randevuAl() {
       System.out.println(ad+" randevu aldi");
	}
}
