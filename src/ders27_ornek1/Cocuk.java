package ders27_ornek1;

public class Cocuk extends Baba{
	String okulAdi;
	public Cocuk() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Cocuk(String ad, int yas, int boy, String gozRengi, String okulAdi) {
		super(ad, yas, boy, gozRengi);
		this.okulAdi = okulAdi;
	}
}
