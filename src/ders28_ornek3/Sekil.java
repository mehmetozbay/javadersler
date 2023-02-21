package ders28_ornek3;

public class Sekil {
	private String ad;
	public Sekil() {
		// TODO Auto-generated constructor stub
	}
	public Sekil(String ad) {
		super();
		this.ad = ad;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public void alanHesapla() {
		System.out.println("Alan Hesaplaniyor ");
	}
	public void cevreHesapla() {
		System.out.println("Cevre Hesaplaniyor");
	}
}
