package ders29_ornek1;

public class Personel {
	private String ad;
	private int saatUcreti;
	private int calismaSaati;
	
	public Personel() {
		// TODO Auto-generated constructor stub
	}

	public Personel(String ad, int saatUcreti, int calismaSaati) {
		super();
		this.ad = ad;
		this.saatUcreti = saatUcreti;
		this.calismaSaati = calismaSaati;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getSaatUcreti() {
		return saatUcreti;
	}

	public void setSaatUcreti(int saatUcreti) {
		this.saatUcreti = saatUcreti;
	}

	public int getCalismaSaati() {
		return calismaSaati;
	}

	public void setCalismaSaati(int calismaSaati) {
		this.calismaSaati = calismaSaati;
	}
	
	
	public int maasHesapla() {
		int baseMaas=getCalismaSaati()*8;
		return baseMaas;
	}
	
}
