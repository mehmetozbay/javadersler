package ders28_ornek3;

public class Kare extends Sekil {

	
	private int kenarUzunlugu;

	
	public Kare() {
		// TODO Auto-generated constructor stub
	}
	public Kare(String ad, int kenarUzunlugu) {
		super(ad);
		this.kenarUzunlugu = kenarUzunlugu;
	}
	
	
	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}
	public void setKenarUzunlugu(int kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}
	
	@Override
	public void alanHesapla() {
		// TODO Auto-generated method stub
		super.alanHesapla();
		System.out.println(getAd()+"nin alani = "+getKenarUzunlugu()*getKenarUzunlugu());
	}
	
	@Override
	public void cevreHesapla() {
		// TODO Auto-generated method stub
		super.cevreHesapla();
		System.out.println( getAd()+" nin  cevresi="+4*getKenarUzunlugu());
	}
}
