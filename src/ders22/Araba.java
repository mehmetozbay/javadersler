package ders22;

public class Araba {
    String marka;
    String modelYili;
	String renk;
	int fiyat;

	public Araba() {
		// TODO Auto-generated constructor stub
	}
	public Araba(String marka, String modelYili, String renk, int fiyat) {
		
		this.marka = marka;
		this.modelYili = modelYili;
		this.renk = renk;
		this.fiyat = fiyat;
	}
	public Araba(String renk) {
		
		this.renk = renk;
	}
	
	
	
}
