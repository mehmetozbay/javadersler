package ders29_Ornek2;

public class Sozel extends Ogrenci {

	public Sozel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sozel(String ad, int numara) {
		super(ad, numara);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bilgiVer() {
	
		System.out.println(getAd()+" ogrencisi sozel bir ogrencidir");
	}

}
