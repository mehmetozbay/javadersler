package ders28_Ornek1;

public class Baba {
	private String adi;
	private int yas;
	
	public Baba() {
		// TODO Auto-generated constructor stub
	}

	public Baba(String adi, int yas) {
		super();
		this.adi = adi;
		this.yas = yas;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
	public void sporYap() {
		System.out.println("Futbol oynar");
	}
}
