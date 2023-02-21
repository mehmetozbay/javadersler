package ders29_Ornek2;

public class Sayisal extends Ogrenci{

	public Sayisal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sayisal(String ad, int numara) {
		super(ad, numara);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bilgiVer() {
		// TODO Auto-generated method stub
		System.out.println(getAd()+" ogrencisi sayisal bir ogrencidir");
	}

}
