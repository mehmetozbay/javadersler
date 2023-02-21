package ders29_Ornek3;

public abstract class Cocuk {
	private String ad;
	private int yas;

	public Cocuk() {
		// TODO Auto-generated constructor stub
	}

	public Cocuk(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}
	public abstract void bilgiVer();
	public abstract void yemekYe();
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

}
