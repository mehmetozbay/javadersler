package ders27_ornek2;

public class Hayvan {
	String ad;
	int yas;
	
	public Hayvan() {
		// TODO Auto-generated constructor stub
	}
	public Hayvan(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}
	public void yemekYer() {
         System.out.println(ad+" yemek yer");
	}
}
