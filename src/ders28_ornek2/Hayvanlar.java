package ders28_ornek2;

public class Hayvanlar {
	private String ad;
	private int yas;
	
	public Hayvanlar() {
		// TODO Auto-generated constructor stub
	}
	public Hayvanlar(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public void yemekYe() {
		// TODO Auto-generated method stub

		
		System.out.println(getAd()+" yemek yer");
	}
}
