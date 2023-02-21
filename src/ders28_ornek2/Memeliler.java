package ders28_ornek2;

public class Memeliler extends Hayvanlar {

	public Memeliler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memeliler(String ad, int yas) {
		super(ad, yas);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void yemekYe() {
		// TODO Auto-generated method stub
	
		super.yemekYe();
		System.out.println( getAd()+" et ve ot yer");
	}
}
