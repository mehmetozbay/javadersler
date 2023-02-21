package ders26_ornek2;

public class User {

	private String adi;
	private int yas;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String adi, int yas) {
		super();
		this.adi = adi;
		this.yas = yas;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		
		String yeniAd=adi.substring(0,1).toUpperCase()+adi.substring(1).toLowerCase();
		this.adi = yeniAd;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "User [adi=" + adi + ", yas=" + yas + "]";
	}
}
