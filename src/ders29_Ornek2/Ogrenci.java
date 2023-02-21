package ders29_Ornek2;

public abstract class Ogrenci {

	private String ad;
	private int numara;
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}

	public Ogrenci(String ad, int numara) {
		super();
		this.ad = ad;
		this.numara = numara;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	public abstract void bilgiVer();
	
}
