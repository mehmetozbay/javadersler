package ders28_ornek3;

public class Daire extends Sekil{

	
	private int yariCap;
	
	
	public Daire() {
		// TODO Auto-generated constructor stub
	}


	public Daire(String ad, int yariCap) {
		super(ad);
		this.yariCap = yariCap;
	}


	public int getYariCap() {
		return yariCap;
	}


	public void setYariCap(int yariCap) {
		this.yariCap = yariCap;
	}
	
	@Override
	public void alanHesapla() {
		// TODO Auto-generated method stub
		super.alanHesapla();
		System.out.println(getAd()+"nin alani "+3.14*getYariCap()*getYariCap());
	}
	
	
	
	@Override
	public void cevreHesapla() {
		// TODO Auto-generated method stub
		super.cevreHesapla();
		System.out.println(getAd()+"nin cevresi "+2*3.14*getYariCap());
	}
}
