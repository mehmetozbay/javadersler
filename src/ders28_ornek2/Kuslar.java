package ders28_ornek2;

public class Kuslar extends Hayvanlar {

	public Kuslar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kuslar(String ad, int yas) {
		super(ad, yas);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void yemekYe() {
		System.out.println(getAd()+" et yer");
	}

}
