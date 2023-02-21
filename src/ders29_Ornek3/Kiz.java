package ders29_Ornek3;

public class Kiz extends Cocuk {

	
	
	public Kiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kiz(String ad, int yas) {
		super(ad, yas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bilgiVer() {
		System.out.println(getAd()+ " ailenin kiz cocugudur "+getYas()+" yasindadir");
	}

	@Override
	public void yemekYe() {
		System.out.println("Pasta yer");

	}

}
