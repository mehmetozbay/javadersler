package ders29_Ornek3;

public class Erkek extends Cocuk {

	public Erkek() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Erkek(String ad, int yas) {
		super(ad, yas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bilgiVer() {
		System.out.println(getAd() + " ailenin erkek cocugudur yasi " + getYas());
	}

	@Override
	public void yemekYe() {
		System.out.println( getAd()+"  et yer");

	}

}
