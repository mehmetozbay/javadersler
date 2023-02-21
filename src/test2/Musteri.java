package test2;

public class Musteri extends Banka {

	
	private String adi;
	private String adres;
	private int yas;
	public static int sayi=0;
	private int id;
	
	
	public Musteri() {
		// TODO Auto-generated constructor stub
		sayi++;
		id=sayi;
	}
	
	
	public Musteri(String adi, String adres, int yas) {
		super();
		this.adi = adi;
		this.adres = adres;
		this.yas = yas;
		sayi++;
		id=sayi;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAdi() {
		return adi;
	}


	public void setAdi(String adi) {
		this.adi = adi;
	}


	public String getAdres() {
		return adres;
	}


	public void setAdres(String adres) {
		this.adres = adres;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
}
